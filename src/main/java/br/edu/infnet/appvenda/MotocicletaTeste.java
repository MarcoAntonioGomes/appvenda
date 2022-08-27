package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.MotocicletaController;
import br.edu.infnet.appvenda.exceptions.NumeroCilindradasInvalidaException;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MotocicletaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#motocicleta");

        try {
            Motocicleta motocicleta1 = new Motocicleta();
            motocicleta1.setPossuiCarenagem ( true);
            motocicleta1.setNumeroDeMarchas ( 4);
            motocicleta1.setCilindrada( 300);
            motocicleta1.setNome( "CB300");
            motocicleta1.setMarca( "Honda");
            motocicleta1.setValor( 30000);
            System.out.println("Cálculo de venda: "+motocicleta1.calcularVenda());
            MotocicletaController.incluir(motocicleta1);
        } catch (NumeroCilindradasInvalidaException e) {
            System.out.println("[ERROR - Motocicleta] " + e.getMessage());
        }





        try {
            Motocicleta motocicleta2 = new Motocicleta();
            motocicleta2.setPossuiCarenagem ( false);
            motocicleta2.setNumeroDeMarchas ( 5);
            motocicleta2.setCilindrada( 400);
            motocicleta2.setNome( "Z400");
            motocicleta2.setMarca( "Kawasaki");
            motocicleta2.setValor( 23000);
            System.out.println("Cálculo de venda: "+motocicleta2.calcularVenda());
            MotocicletaController.incluir(motocicleta2);
        } catch (NumeroCilindradasInvalidaException e) {
            System.out.println("[ERROR - Motocicleta] " + e.getMessage());
        }



        try {
            Motocicleta motocicleta3 = new Motocicleta();
            motocicleta3.setPossuiCarenagem ( true);
            motocicleta3.setNumeroDeMarchas ( 4);
            motocicleta3.setCilindrada( 150);
            motocicleta3.setNome( "CG Titan");
            motocicleta3.setMarca( "Honda");
            motocicleta3.setValor( 8000);
            System.out.println("Cálculo de venda: "+motocicleta3.calcularVenda());
            MotocicletaController.incluir(motocicleta3);
        } catch (NumeroCilindradasInvalidaException e) {
            System.out.println("[ERROR - Motocicleta] " + e.getMessage());
        }

        try {
            Motocicleta motocicleta4 = new Motocicleta();
            motocicleta4.setPossuiCarenagem ( true);
            motocicleta4.setNumeroDeMarchas ( 4);
            motocicleta4.setCilindrada( 10);
            motocicleta4.setNome( "CG Titan");
            motocicleta4.setMarca( "Honda");
            motocicleta4.setValor( 8000);
            System.out.println("Cálculo de venda: "+motocicleta4.calcularVenda());
            MotocicletaController.incluir(motocicleta4);
        } catch (NumeroCilindradasInvalidaException e) {
            System.out.println("[ERROR - Motocicleta] " + e.getMessage());
        }

    }
}
