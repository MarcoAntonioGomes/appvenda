package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.domain.Venda;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class VendaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args)  {

        System.out.println("#venda");
        Venda venda = new Venda("Jose","11122233344","jose@gmail.com");
        venda.setDescricao("Venda 1");
        venda.setAvista(  true);
        venda.setData(  LocalDateTime.now());
        new AppImpressao().relatorio(venda,"Inclusão da venda 1 !!!");


        Venda venda2 = new Venda("Maria","11122233355","maria@gmail.com");
        venda2.setDescricao(  "Venda 2");
        venda2.setAvista(  false);
        venda2.setData(  LocalDateTime.now());
        new AppImpressao().relatorio(venda2,"Inclusão da venda 2 !!!");

        Venda venda3 = new Venda("Joao","11122233366","joao@gmail.com");
        venda3.setDescricao(  "Venda 3");
        venda3.setAvista(  true);
        venda3.setData( LocalDateTime.now());
        new AppImpressao().relatorio(venda3,"Inclusão da venda 3 !!!");
    }
}
