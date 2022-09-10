package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.model.domain.app.Atributo;
import br.edu.infnet.appvenda.model.domain.app.Classe;
import br.edu.infnet.appvenda.model.domain.app.Projeto;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AppTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {


        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
        String arq = "app.txt";

        try {
            try {
                FileReader fileReader = new FileReader(dir + arq);
                BufferedReader leitura = new BufferedReader(fileReader);
                String linha = leitura.readLine();
                Projeto projeto = null;
                List<Classe> classes = null;
                List<Atributo> atributos = null;

                while (linha != null) {

                    String[] campos = linha.split(";");

                    switch (campos[0].toUpperCase()) {
                        case "P":
                            classes = new ArrayList<>();

                            projeto = new Projeto();
                            projeto.setNome(campos[1]);
                            projeto.setDescricao(campos[2]);
                            projeto.setClasses(classes);
                            break;
                        case "C":
                            atributos = new ArrayList<Atributo>();
                            Classe classe = new Classe();
                            classe.setNome(campos[1]);
                            classe.setAtributos(atributos);
                            classes.add(classe);
                            break;
                        case "A":
                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
                            atributos.add(atributo);
                            break;
                    }


                    linha = leitura.readLine();
                }

                projeto.impressao();
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
