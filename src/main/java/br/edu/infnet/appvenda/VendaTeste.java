package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.model.domain.*;
import br.edu.infnet.appvenda.model.test.AppImpressao;
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
        Venda venda = new Venda(new Comprador("Jose","11122233344","jose@gmail.com"));
        venda.setDescricao("Venda 1");
        venda.setAvista(  true);
        Set<Veiculo> veiculos = new HashSet<Veiculo>();

        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("volkswagen");
        veiculos.add(automovel1);

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setPossuiCarenagem ( false);
        motocicleta.setNumeroDeMarchas ( 5);
        motocicleta.setCilindrada( 400);
        motocicleta.setNome( "Z400");
        motocicleta.setMarca( "Kawasaki");
        motocicleta.setValor( 23000);

        veiculos.add(motocicleta);


        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);

        veiculos.add(caminhao2);

        venda.setVeiculos(veiculos);

        new AppImpressao().relatorio(venda,"Inclusão da venda 1 !!!");


        Venda venda2 = new Venda(new Comprador("Maria","11122233355","maria@gmail.com"));
        venda2.setDescricao(  "Venda 2");
        venda2.setAvista(  false);

        Motocicleta motocicleta2 = new Motocicleta();
        motocicleta2.setPossuiCarenagem ( false);
        motocicleta2.setNumeroDeMarchas ( 5);
        motocicleta2.setCilindrada( 400);
        motocicleta2.setNome( "Z400");
        motocicleta2.setMarca( "Kawasaki");
        motocicleta2.setValor( 23000);

        veiculos = new HashSet<Veiculo>();
        veiculos.add(motocicleta2);
        venda2.setVeiculos(veiculos);

        new AppImpressao().relatorio(venda2,"Inclusão da venda 2 !!!");

        Venda venda3 = new Venda(new Comprador("Joao","11122233366","joao@gmail.com"));
        venda3.setDescricao(  "Venda 3");
        venda3.setAvista(  true);

        Caminhao caminhao3 = new Caminhao();
        caminhao3.setCapacidadeDeTransporte( 10000);
        caminhao3.setTipoCarroceria( "Prancha");
        caminhao3.setTorque( 400);
        caminhao3.setNome( "1313");
        caminhao3.setMarca( "Volvo");
        caminhao3.setValor(  150000);

        veiculos = new HashSet<Veiculo>();
        veiculos.add(caminhao3);
        venda3.setVeiculos(veiculos);

        new AppImpressao().relatorio(venda3,"Inclusão da venda 3 !!!");
    }
}
