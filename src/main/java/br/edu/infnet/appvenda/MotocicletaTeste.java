package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.MotocicletaController;
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
        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.setPossuiCarenagem ( true);
        motocicleta1.setNumeroDeMarchas ( 4);
        motocicleta1.setCilindrada( 300);
        motocicleta1.setNome( "CB300");
        motocicleta1.setMarca( "Honda");
        motocicleta1.setValor( 30000);
        MotocicletaController.incluir(motocicleta1);



        Motocicleta motocicleta2 = new Motocicleta();
        motocicleta2.setPossuiCarenagem ( false);
        motocicleta2.setNumeroDeMarchas ( 5);
        motocicleta2.setCilindrada( 400);
        motocicleta2.setNome( "Z400");
        motocicleta2.setMarca( "Kawasaki");
        motocicleta2.setValor( 23000);
        MotocicletaController.incluir(motocicleta2);

        Motocicleta motocicleta3 = new Motocicleta();
        motocicleta3.setPossuiCarenagem ( true);
        motocicleta3.setNumeroDeMarchas ( 4);
        motocicleta3.setCilindrada( 150);
        motocicleta3.setNome( "CG Titan");
        motocicleta3.setMarca( "Honda");
        motocicleta3.setValor( 8000);
        MotocicletaController.incluir(motocicleta3);

    }
}
