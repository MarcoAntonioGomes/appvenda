package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.exceptions.CompradorNuloException;
import br.edu.infnet.appvenda.exceptions.CpfInvalidoException;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.exceptions.VendaSemVeiculosException;
import br.edu.infnet.appvenda.model.domain.*;
import br.edu.infnet.appvenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
public class VendaTeste implements ApplicationRunner {

    @Autowired
    private VendaService vendaService;


    @Override
    public void run(ApplicationArguments args) {

        System.out.println("#venda");


        Set<Veiculo> veiculos = new HashSet<Veiculo>();
        List<Venda> vendas = new ArrayList<>();


        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "vendas.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null) {

                    List<String> campos = List.of(linha.split(";"));

                    switch (campos.get(0).toUpperCase()) {
                        case "V":
                            try {
                                Venda venda = new Venda(new Comprador(campos.get(2), campos.get(3), campos.get(4)), veiculos);
                                venda.setDescricao(campos.get(1));
                                venda.setAvista(Boolean.valueOf(campos.get(5)));
                                vendas.add(venda);
                            } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
                                System.out.println("[ERROR - VENDA] " + e.getMessage());
                            }
                            break;
                        case "A":

                            Automovel automovel = new Automovel();
                            automovel.setPossuiAirbag(Boolean.valueOf(campos.get(5)));
                            automovel.setQuantidadeDePortas(Integer.valueOf(campos.get(6)));
                            automovel.setTipo(campos.get(1));
                            automovel.setNome(campos.get(2));
                            automovel.setValor(Float.parseFloat(campos.get(3)));
                            automovel.setMarca(campos.get(4));
                            veiculos.add(automovel);

                            break;
                        case "C":

                            Caminhao caminhao = new Caminhao();
                            caminhao.setCapacidadeDeTransporte(Float.valueOf(campos.get(1)));
                            caminhao.setTipoCarroceria(campos.get(2));
                            caminhao.setTorque(Float.valueOf(campos.get(3)));
                            caminhao.setNome(campos.get(4));
                            caminhao.setMarca(campos.get(5));
                            caminhao.setValor(Float.valueOf(campos.get(6)));
                            veiculos.add(caminhao);

                            break;
                        case "M":

                            Motocicleta motocicleta = new Motocicleta();
                            motocicleta.setPossuiCarenagem(Boolean.valueOf(campos.get(1)));
                            motocicleta.setNumeroDeMarchas(Integer.valueOf(campos.get(2)));
                            motocicleta.setCilindrada(Integer.valueOf(campos.get(3)));
                            motocicleta.setNome(campos.get(4));
                            motocicleta.setMarca(campos.get(5));
                            motocicleta.setValor(Float.valueOf(campos.get(6)));
                            veiculos.add(motocicleta);

                            break;
                    }


                    linha = leitura.readLine();
                }

                for (Venda v : vendas) {
                    vendaService.incluir(v);
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
