package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.CompradorController;
import br.edu.infnet.appvenda.controller.UsuarioController;
import br.edu.infnet.appvenda.exceptions.CpfInvalidoException;
import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.domain.Usuario;
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


//        String dir = "C:/Users/marco/Desktop/POS-PROJETOS/appvenda/src/main/resources/files/";
//        String arq = "compradores.txt";
//
//        try {
//            try {
//                FileReader fileReader = new FileReader(dir + arq);
//                BufferedReader leitura = new BufferedReader(fileReader);
//
//                String linha = leitura.readLine();
//
//                while (linha != null){
//
//                    List<String> campos = List.of(linha.split(";"));
//
//                    try {
//                        Comprador c1 = new Comprador(campos.get(0), campos.get(1), campos.get(2));
//                        CompradorController.incluir(c1);
//                    } catch (CpfInvalidoException e) {
//                        System.out.println("[ERROR] " + e.getMessage());
//                    }
//
//
//                    linha = leitura.readLine();
//                }
//
//
//                leitura.close();
//                fileReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println("[ERRO] O arquivo não existe!!!");
//            } catch (IOException e) {
//                System.out.println("[ERRO] Problema no fechamento do arquivo!!!");
//            }
//
//
//        } finally {
//            System.out.println("Terminou!!!");
//        }
//
//
//        List<Atributo> atributos = new ArrayList<>();
//
//        Atributo quantidadeDePortas  = new Atributo("quantidadeDePortas", "int", "Quantidade de portas do automovel");
//        Atributo  tipo =  new Atributo("tipo", "String", "Tipo do automovel. Ex: Caminhonete, Carro...");
//        Atributo possuiAirbag = new Atributo("possuiAirbag", "boolean", "Indicativo se o carro possui airbag");
//
//
//        Classe automovel = new Classe();
//        automovel.setNome("Automovel");
//        automovel.setAtributos(atributos);
//
//        Classe caminhao = new Classe();
//        caminhao.setNome("Caminhão");
//
//        Classe motocicleta = new Classe();
//        motocicleta.setNome("Motoocicleta");
//
//        Classe veiculo = new Classe();
//        veiculo.setNome("Veiculo");
//
//        Classe comprador = new Classe();
//        comprador.setNome("Comprador");
//
//        Classe usuario = new Classe();
//        usuario.setNome("Usuario");
//
//
//        List<Classe> classes = new ArrayList<>();
//        classes.add(automovel);
//        classes.add(caminhao);
//        classes.add(motocicleta);
//        classes.add(veiculo);
//        classes.add(comprador);
//        classes.add(usuario);
//
//
//
//
//
//
//
//
//
//
//        Projeto projeto = new Projeto();
//        projeto.setNome("AppVendas");
//        projeto.setDescricao("Projeto de Gestão de Venda de Veículos");
//        projeto.setClasses(classes);
//        projeto.impressao();

    }



}
