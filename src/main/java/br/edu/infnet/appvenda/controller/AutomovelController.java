package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Automovel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AutomovelController {

    private static List<Automovel> automoveis =  null;

    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){

        automoveis = new ArrayList<>();

        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("Volkswagen");

        Automovel automovel2 = new Automovel();
        automovel2.setPossuiAirbag(false);
        automovel2.setQuantidadeDePortas(2);
        automovel2.setTipo("Caminhonete");
        automovel2.setNome("Strada");
        automovel2.setValor(50000);
        automovel2.setMarca("Fiat");


        Automovel automovel3 = new Automovel();
        automovel3.setPossuiAirbag(true);
        automovel3.setQuantidadeDePortas(4);
        automovel3.setTipo("Esportivo");
        automovel3.setNome( "A4");
        automovel3.setValor(400000);
        automovel3.setMarca("Audi");


        automoveis.add(automovel1);
        automoveis.add(automovel2);
        automoveis.add(automovel3);

        model.addAttribute("listagem",automoveis);

        return "automovel/lista";
    }

}
