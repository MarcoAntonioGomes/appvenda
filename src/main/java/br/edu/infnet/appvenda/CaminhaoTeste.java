package br.edu.infnet.appvenda;



import br.edu.infnet.appvenda.exceptions.CapacidadeTransporteInvalidaException;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.CaminhaoService;
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
@Order(3)
public class CaminhaoTeste implements ApplicationRunner {

    @Autowired
    private CaminhaoService caminhaoService;

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("#caminhao");
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

                        if(campos.get(0).equalsIgnoreCase("C")) {

                            Caminhao caminhao1 = new Caminhao();
                            caminhao1.setCapacidadeDeTransporte(Float.valueOf(campos.get(1)));
                            caminhao1.setTipoCarroceria(campos.get(2));
                            caminhao1.setTorque(Float.valueOf(campos.get(3)));
                            caminhao1.setNome(campos.get(4));
                            caminhao1.setMarca(campos.get(5));
                            caminhao1.setValor(Float.valueOf(campos.get(6)));
                            caminhao1.setUsuario(usuario);
                            System.out.println("Cálculo de venda: " + caminhao1.calcularVenda());
                            caminhaoService.incluir(caminhao1);
                        }
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
