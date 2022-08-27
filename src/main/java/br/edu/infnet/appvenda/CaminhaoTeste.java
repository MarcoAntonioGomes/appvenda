package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.AutomovelController;
import br.edu.infnet.appvenda.controller.CaminhaoController;
import br.edu.infnet.appvenda.exceptions.CapacidadeTransporteInvalidaException;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class CaminhaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("#caminhao");

        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "caminhoes.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);

                String linha = leitura.readLine();

                while (linha != null){

                    List<String> campos = List.of(linha.split(";"));

                    try {
                        Caminhao caminhao1 = new Caminhao();
                        caminhao1.setCapacidadeDeTransporte(Float.valueOf(campos.get(0)));
                        caminhao1.setTipoCarroceria(campos.get(1));
                        caminhao1.setTorque( Float.valueOf(campos.get(2)));
                        caminhao1.setNome(campos.get(3));
                        caminhao1.setMarca( campos.get(4));
                        caminhao1.setValor( Float.valueOf(campos.get(5)));
                        System.out.println("Cálculo de venda: "+caminhao1.calcularVenda());
                        CaminhaoController.incluir(caminhao1);
                    } catch (CapacidadeTransporteInvalidaException e) {
                        System.out.println("[ERROR - Caminhao] " + e.getMessage());
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
