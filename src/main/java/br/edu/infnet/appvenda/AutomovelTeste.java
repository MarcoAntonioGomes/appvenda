package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.AutomovelController;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.model.domain.Automovel;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AutomovelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#automovel");

        try {
            Automovel automovel1 = new Automovel();
            automovel1.setPossuiAirbag(true);
            automovel1.setQuantidadeDePortas(4);
            automovel1.setTipo("Carro comum");
            automovel1.setNome("Gol");
            automovel1.setValor(30000);
            automovel1.setMarca("volkswagen");
            System.out.println("Cálculo de venda: "+automovel1.calcularVenda());
            AutomovelController.incluir(automovel1);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }




        try {
            Automovel automovel2 = new Automovel();
            automovel2.setPossuiAirbag(false);
            automovel2.setQuantidadeDePortas(2);
            automovel2.setTipo("Caminhonete");
            automovel2.setNome("Strada");
            automovel2.setValor(50000);
            automovel2.setMarca("Fiat");
            System.out.println("Cálculo de venda: "+automovel2.calcularVenda());
            AutomovelController.incluir(automovel2);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }





        try {
            Automovel automovel3 = new Automovel();
            automovel3.setPossuiAirbag(true);
            automovel3.setQuantidadeDePortas(4);
            automovel3.setTipo("Esportivo");
            automovel3.setNome( "A4");
            automovel3.setValor(400000);
            automovel3.setMarca("Audi");
            System.out.println("Cálculo de venda: "+automovel3.calcularVenda());
            AutomovelController.incluir(automovel3);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }


        try {
            Automovel automovel4 = new Automovel();
            automovel4.setPossuiAirbag(true);
            automovel4.setQuantidadeDePortas(0);
            automovel4.setTipo("Esportivo");
            automovel4.setNome( "A4");
            automovel4.setValor(400000);
            automovel4.setMarca("Audi");
            System.out.println("Cálculo de venda: "+automovel4.calcularVenda());
            AutomovelController.incluir(automovel4);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }

        try {
            Automovel automovel5 = new Automovel();
            automovel5.setPossuiAirbag(true);
            automovel5.setQuantidadeDePortas(1);
            automovel5.setTipo("Esportivo");
            automovel5.setNome( "A4");
            automovel5.setValor(400000);
            automovel5.setMarca("Audi");
            System.out.println("Cálculo de venda: "+automovel5.calcularVenda());
            AutomovelController.incluir(automovel5);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }

        try {
            Automovel automovel6 = new Automovel();
            automovel6.setPossuiAirbag(true);
            automovel6.setQuantidadeDePortas(10);
            automovel6.setTipo("Esportivo");
            automovel6.setNome( "A4");
            automovel6.setValor(400000);
            automovel6.setMarca("Audi");
            System.out.println("Cálculo de venda: "+automovel6.calcularVenda());
            AutomovelController.incluir(automovel6);
        } catch (QuantidadePortasInvalidoException e) {
            System.out.println("[ERROR - Automovel] " + e.getMessage());
        }

    }
}
