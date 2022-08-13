package br.edu.infnet.appvenda;

import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AutomovelTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#automovel");
        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("volkswagen");

        new AppImpressao().relatorio(automovel1,"Inclusão do Automovel Gol!!!");

        Automovel automovel2 = new Automovel();
        automovel2.setPossuiAirbag(false);
        automovel2.setQuantidadeDePortas(2);
        automovel2.setTipo("Caminhonete");
        automovel2.setNome("Strada");
        automovel2.setValor(50000);
        automovel2.setMarca("Fiat");


         new AppImpressao().relatorio(automovel2, "Inclusão do Automovel Strada!!!");


        Automovel automovel3 = new Automovel();
        automovel3.setPossuiAirbag(true);
        automovel3.setQuantidadeDePortas(4);
        automovel3.setTipo("Esportivo");
        automovel3.setNome( "A4");
        automovel3.setValor(400000);
        automovel3.setMarca("Audi");


        new AppImpressao().relatorio(automovel3, "Inclusão do Automovel A4 !!!");
    }
}
