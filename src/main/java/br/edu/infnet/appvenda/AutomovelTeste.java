package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.model.domain.Automovel;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AutomovelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#automovel");
        Automovel automovel1 = new Automovel();
        automovel1.possuiAirbag = true;
        automovel1.quantidadeDePortas = 4;
        automovel1.tipo = "Carro comum";
        automovel1.nome = "Gol";
        automovel1.valor = 30000;
        automovel1.marca = "volkswagen";


        System.out.println(automovel1 );

        Automovel automovel2 = new Automovel();
        automovel2.possuiAirbag = false;
        automovel2.quantidadeDePortas = 2;
        automovel2.tipo = "Caminhonete";
        automovel2.nome = "Strada";
        automovel2.valor = 50000;
        automovel2.marca = "Fiat";

        System.out.println(automovel2);

        Automovel automovel3 = new Automovel();
        automovel3.possuiAirbag = true;
        automovel3.quantidadeDePortas = 4;
        automovel3.tipo = "Esportivo";
        automovel3.nome = "A4";
        automovel3.valor = 400000;
        automovel3.marca = "Audi";

        System.out.println(automovel3);
    }
}
