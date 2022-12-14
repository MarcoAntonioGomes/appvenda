package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
@Order(2)
public class AutomovelTeste implements ApplicationRunner {

    @Autowired
    private AutomovelService automovelService;


    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#automovel");
        Usuario usuario = new Usuario();
        usuario.setId(1);


        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "veiculos.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    List<String> campos = List.of(linha.split(";"));

                    try {

                        if(campos.get(0).equalsIgnoreCase("A")){

                            Automovel automovel1 = new Automovel();
                            automovel1.setPossuiAirbag(Boolean.valueOf(campos.get(5)));
                            automovel1.setQuantidadeDePortas(Integer.valueOf(campos.get(6)));
                            automovel1.setTipo(campos.get(1));
                            automovel1.setNome(campos.get(2));
                            automovel1.setValor(Float.parseFloat(campos.get(3)));
                            automovel1.setMarca(campos.get(4));
                            automovel1.setUsuario(usuario);
                            System.out.println("C??lculo de venda: "+automovel1.calcularVenda());
                            automovelService.incluir(automovel1);

                        }



                    } catch (QuantidadePortasInvalidoException e) {
                        System.out.println("[ERROR - Automovel] " + e.getMessage());
                    }


                    linha = leitura.readLine();
                }


                leitura.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("[ERRO] O arquivo n??o existe!!!");
            } catch (IOException e) {
                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
            }


        } finally {
            System.out.println("Terminou!!!");
        }

    }





}
