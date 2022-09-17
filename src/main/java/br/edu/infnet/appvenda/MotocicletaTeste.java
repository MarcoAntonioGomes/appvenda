package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.AutomovelController;
import br.edu.infnet.appvenda.controller.MotocicletaController;
import br.edu.infnet.appvenda.exceptions.NumeroCilindradasInvalidaException;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import br.edu.infnet.appvenda.service.MotocicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class MotocicletaTeste implements ApplicationRunner {

    @Autowired
    private MotocicletaService motocicletaService;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#motocicleta");

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
                        if(campos.get(0).equalsIgnoreCase("M")) {

                            Motocicleta motocicleta1 = new Motocicleta();
                            motocicleta1.setPossuiCarenagem(Boolean.valueOf(campos.get(1)));
                            motocicleta1.setNumeroDeMarchas(Integer.valueOf(campos.get(2)));
                            motocicleta1.setCilindrada(Integer.valueOf(campos.get(3)));
                            motocicleta1.setNome(campos.get(4));
                            motocicleta1.setMarca(campos.get(5));
                            motocicleta1.setValor(Float.valueOf(campos.get(6)));
                            System.out.println("Cálculo de venda: " + motocicleta1.calcularVenda());
                            motocicletaService.incluir(motocicleta1);
                        }
                    } catch (NumeroCilindradasInvalidaException e) {
                        System.out.println("[ERROR - Motocicleta] " + e.getMessage());
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
