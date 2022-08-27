package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.AutomovelController;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class AutomovelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#automovel");



        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "automoveis.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    List<String> campos = List.of(linha.split(";"));

                    try {
                        Automovel automovel1 = new Automovel();
                        automovel1.setPossuiAirbag(Boolean.valueOf(campos.get(4)));
                        automovel1.setQuantidadeDePortas(Integer.valueOf(campos.get(5)));
                        automovel1.setTipo(campos.get(0));
                        automovel1.setNome(campos.get(1));
                        automovel1.setValor(Float.parseFloat(campos.get(2)));
                        automovel1.setMarca(campos.get(3));
                        System.out.println("Cálculo de venda: "+automovel1.calcularVenda());
                        AutomovelController.incluir(automovel1);
                    } catch (QuantidadePortasInvalidoException e) {
                        System.out.println("[ERROR - Automovel] " + e.getMessage());
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
