package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.controller.CaminhaoController;
import br.edu.infnet.appvenda.exceptions.CapacidadeTransporteInvalidaException;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CaminhaoTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

        System.out.println("#caminhao");

        try {
            Caminhao caminhao1 = new Caminhao();
            caminhao1.setCapacidadeDeTransporte( 13000);
            caminhao1.setTipoCarroceria( "Bau");
            caminhao1.setTorque( 500);
            caminhao1.setNome( "Vertis");
            caminhao1.setMarca( "Iveco");
            caminhao1.setValor(  200000);
            System.out.println("Cálculo de venda: "+caminhao1.calcularVenda());
            CaminhaoController.incluir(caminhao1);
        } catch (CapacidadeTransporteInvalidaException e) {
            System.out.println("[ERROR - Caminhao] " + e.getMessage());
        }



        try {

            Caminhao caminhao2 = new Caminhao();
            caminhao2.setCapacidadeDeTransporte( 9000);
            caminhao2.setTipoCarroceria( "Plataforma");
            caminhao2.setTorque( 300);
            caminhao2.setNome( "45s14");
            caminhao2.setMarca( "Iveco");
            caminhao2.setValor(  100000);
            System.out.println("Cálculo de venda: "+caminhao2.calcularVenda());
            CaminhaoController.incluir(caminhao2);
        } catch (CapacidadeTransporteInvalidaException e) {
            System.out.println("[ERROR - Caminhao] " + e.getMessage());
        }



        try {
            Caminhao caminhao3 = new Caminhao();
            caminhao3.setCapacidadeDeTransporte( 10000);
            caminhao3.setTipoCarroceria( "Prancha");
            caminhao3.setTorque( 400);
            caminhao3.setNome( "1313");
            caminhao3.setMarca( "Volvo");
            caminhao3.setValor(  150000);
            System.out.println("Cálculo de venda: "+caminhao3.calcularVenda());
            CaminhaoController.incluir(caminhao3);
        } catch (CapacidadeTransporteInvalidaException e) {
            System.out.println("[ERROR - Caminhao] " + e.getMessage());
        }

        try {
            Caminhao caminhao4 = new Caminhao();
            caminhao4.setCapacidadeDeTransporte( 500);
            caminhao4.setTipoCarroceria( "Prancha");
            caminhao4.setTorque( 400);
            caminhao4.setNome( "1313");
            caminhao4.setMarca( "Volvo");
            caminhao4.setValor(  150000);
            System.out.println("Cálculo de venda: "+ caminhao4.calcularVenda());
            CaminhaoController.incluir(caminhao4);
        } catch (CapacidadeTransporteInvalidaException e) {
            System.out.println("[ERROR - Caminhao] " + e.getMessage());
        }


    }
}
