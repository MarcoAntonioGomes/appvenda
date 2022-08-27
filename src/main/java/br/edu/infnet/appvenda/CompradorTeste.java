package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.CompradorController;
import br.edu.infnet.appvenda.model.domain.Comprador;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CompradorTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {
        System.out.println("#comprador");


        try {
            Comprador c1 = new Comprador("Maria da Silva", "12325642211", "maria@maria.com");
            CompradorController.incluir(c1);
        } catch (Exception e) {
           System.out.println("[ERROR] " + e.getMessage());
        }



        try {
            Comprador c2 = new Comprador("Gilberto Braga", "12355533322", "gilberto@gil.com");
            CompradorController.incluir(c2);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }


        try {
            Comprador c3  = new Comprador("Tunico", "22233344455", "tunico@tunico.com");
            CompradorController.incluir(c3);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }


        try {
            Comprador c4 = new Comprador("Braga", null, "braga@braga.com");
            CompradorController.incluir(c4);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }


        try {
            Comprador c5 = new Comprador("Jose", "", "jose@jose.com");
            CompradorController.incluir(c5);
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }


    }
}
