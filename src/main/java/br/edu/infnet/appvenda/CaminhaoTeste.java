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
        caminhao1.setCapacidadeDeTransporte( 13000);
        caminhao1.setTipoCarroceria( "Bau");
        caminhao1.setTorque( 500);
        caminhao1.setNome( "Vertis");
        caminhao1.setMarca( "Iveco");
        caminhao1.setValor(  200000);

        System.out.println(caminhao1);

        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);


        System.out.println(caminhao2);

        Caminhao caminhao3 = new Caminhao();
        caminhao3.setCapacidadeDeTransporte( 10000);
        caminhao3.setTipoCarroceria( "Prancha");
        caminhao3.setTorque( 400);
        caminhao3.setNome( "1313");
        caminhao3.setMarca( "Volvo");
        caminhao3.setValor(  150000);

        System.out.println(caminhao3);
    }
}
