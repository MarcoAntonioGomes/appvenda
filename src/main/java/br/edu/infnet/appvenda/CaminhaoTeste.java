package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.model.domain.Caminhao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CaminhaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("#caminhao");
        Caminhao caminhao1 = new Caminhao();
        caminhao1.capacidadeDeTransporte = 13000;
        caminhao1.tipoCarroceria = "Bau";
        caminhao1.torque = 500;

        System.out.println(caminhao1);

        Caminhao caminhao2 = new Caminhao();
        caminhao2.capacidadeDeTransporte = 9000;
        caminhao2.tipoCarroceria = "Plataforma";
        caminhao2.torque = 300;

        System.out.println(caminhao2);

        Caminhao caminhao3 = new Caminhao();
        caminhao3.capacidadeDeTransporte = 10000;
        caminhao3.tipoCarroceria = "Prancha";
        caminhao3.torque = 400;

        System.out.println(caminhao3);
    }
}
