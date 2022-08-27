package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.controller.VendaController;
import br.edu.infnet.appvenda.exceptions.CompradorNuloException;
import br.edu.infnet.appvenda.exceptions.CpfInvalidoException;
import br.edu.infnet.appvenda.exceptions.VendaSemVeiculosException;
import br.edu.infnet.appvenda.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
public class VendaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#venda");


        Set<Veiculo> veiculos = new HashSet<Veiculo>();

        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("volkswagen");


        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setPossuiCarenagem ( false);
        motocicleta.setNumeroDeMarchas ( 5);
        motocicleta.setCilindrada( 400);
        motocicleta.setNome( "Z400");
        motocicleta.setMarca( "Kawasaki");
        motocicleta.setValor( 23000);


        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);

        veiculos.add(motocicleta);
        veiculos.add(automovel1);
        veiculos.add(caminhao2);




        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "vendas.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    List<String> campos = List.of(linha.split(";"));

                    try {
                        Venda venda  = new Venda(new Comprador(campos.get(1),campos.get(2),campos.get(3)), veiculos);
                        venda.setDescricao(campos.get(0));
                        venda.setAvista(  Boolean.valueOf(campos.get(4)));
                        VendaController.incluir(venda);

                    } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
                        System.out.println("[ERROR - VENDA] " + e.getMessage());
                    }

                    linha = leitura.readLine();
                }


                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo não existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }


        } finally {
            System.out.println("Terminou!!!");
        }

    }
}
