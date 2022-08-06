package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.model.domain.Motocicleta;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MotocicletaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("#motocicleta");
        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.possuiCarenagem = true;
        motocicleta1.numeroDeMarchas = 4;
        motocicleta1.cilindrada = 300;

        System.out.println(motocicleta1 );

        Motocicleta motocicleta2 = new Motocicleta();
        motocicleta2.possuiCarenagem = false;
        motocicleta2.numeroDeMarchas = 5;
        motocicleta2.cilindrada = 400;

        System.out.println(motocicleta2);

        Motocicleta motocicleta3 = new Motocicleta();
        motocicleta3.possuiCarenagem = true;
        motocicleta3.numeroDeMarchas = 2;
        motocicleta3.cilindrada = 150;

        System.out.println(motocicleta3);
    }
}
