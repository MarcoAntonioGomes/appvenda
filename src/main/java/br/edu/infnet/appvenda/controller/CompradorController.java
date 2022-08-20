package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CompradorController {

    private static List<Comprador> compradores = new ArrayList<>();

    public static void incluir(Comprador comprador){
        compradores.add(comprador);
        new AppImpressao().relatorio(comprador,"Inclusão do comprador " + comprador.getNome() + "realizada com sucesso!!!");

    }

    @GetMapping(value = "/comprador/lista")
    public String telaLista(Model model){


        model.addAttribute("listagem", compradores);

        return "comprador/lista";
    }

}
