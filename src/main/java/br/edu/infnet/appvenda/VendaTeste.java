package br.edu.infnet.appvenda;


import br.edu.infnet.appvenda.model.domain.Venda;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class VendaTeste implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("#venda");
        Venda venda = new Venda();
        venda.descricao = "Venda 1";
        venda.avista = true;
        venda.data = LocalDateTime.now();


        System.out.println(venda);
        Venda venda2 = new Venda();
        venda2.descricao = "Venda 2";
        venda2.avista = false;
        venda2.data = LocalDateTime.now();

        System.out.println(venda2);

        Venda venda3 = new Venda();
        venda3.descricao = "Venda 3";
        venda3.avista = true;
        venda3.data = LocalDateTime.now();

        System.out.println(venda3);
    }
}
