package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.controller.VendaController;
import br.edu.infnet.appvenda.exceptions.CompradorNuloException;
import br.edu.infnet.appvenda.exceptions.CpfInvalidoException;
import br.edu.infnet.appvenda.exceptions.VendaSemVeiculosException;
import br.edu.infnet.appvenda.model.domain.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.util.HashSet;
import java.util.Set;


@Component
public class VendaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#venda");


        Set<Veiculo> veiculos = new HashSet<Veiculo>();

        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("volkswagen");


        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setPossuiCarenagem ( false);
        motocicleta.setNumeroDeMarchas ( 5);
        motocicleta.setCilindrada( 400);
        motocicleta.setNome( "Z400");
        motocicleta.setMarca( "Kawasaki");
        motocicleta.setValor( 23000);


        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);

        veiculos.add(motocicleta);
        veiculos.add(automovel1);
        veiculos.add(caminhao2);


        try {
            Venda venda  = new Venda(new Comprador("Jose","11122233344","jose@gmail.com"), veiculos);
            venda.setDescricao("Venda 1");
            venda.setAvista(  true);
            VendaController.incluir(venda);

        } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }


        Motocicleta motocicleta2 = new Motocicleta();
        motocicleta2.setPossuiCarenagem ( false);
        motocicleta2.setNumeroDeMarchas ( 5);
        motocicleta2.setCilindrada( 400);
        motocicleta2.setNome( "Z400");
        motocicleta2.setMarca( "Kawasaki");
        motocicleta2.setValor( 23000);

        veiculos = new HashSet<Veiculo>();
        veiculos.add(motocicleta2);


        try {
            Venda venda2  = new Venda(new Comprador("Maria","11122233355","maria@gmail.com"),veiculos);
            venda2.setDescricao(  "Venda 2");
            venda2.setAvista(  false);
            VendaController.incluir(venda2);

        }  catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }

        Caminhao caminhao3 = new Caminhao();
        caminhao3.setCapacidadeDeTransporte( 10000);
        caminhao3.setTipoCarroceria( "Prancha");
        caminhao3.setTorque( 400);
        caminhao3.setNome( "1313");
        caminhao3.setMarca( "Volvo");
        caminhao3.setValor(  150000);


        veiculos = new HashSet<Veiculo>();
        veiculos.add(caminhao3);



        try {
            Venda venda3  = new Venda(new Comprador("Joao","11122233366","joao@gmail.com"), veiculos);
            venda3.setDescricao(  "Venda 3");
            venda3.setAvista(  true);
            VendaController.incluir(venda3);
        } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }


        try {
            Comprador comprador = new Comprador("Joao","11122233366","joao@gmail.com");

            Venda venda4 = new Venda(null, veiculos);
            venda4.setDescricao(  "Venda 3");
            venda4.setAvista(  true);
            VendaController.incluir(venda4);
        } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }

        try {
            Comprador comprador = new Comprador("Joao","11122233366","joao@gmail.com");

            veiculos = new HashSet<>();
            Venda venda4 = new Venda(comprador, veiculos );
            venda4.setDescricao(  "Venda 4");
            venda4.setAvista(  true);
            VendaController.incluir(venda4);
        } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }

        try {
            Comprador comprador = new Comprador("Joao","11122233366","joao@gmail.com");

            veiculos = new HashSet<>();
            Venda venda5 = new Venda(comprador, null );
            venda5.setDescricao(  "Venda 5");
            venda5.setAvista(  true);
            VendaController.incluir(venda5);
        } catch (CpfInvalidoException | CompradorNuloException | VendaSemVeiculosException e) {
            System.out.println("[ERROR - VENDA] " + e.getMessage());
        }


    }
}
