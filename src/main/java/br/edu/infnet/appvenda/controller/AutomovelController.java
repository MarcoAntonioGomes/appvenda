package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AutomovelController {

    private static List<Automovel> automoveis =  new ArrayList<>();


    public static void incluir(Automovel automovel){
        automoveis.add(automovel);
        new AppImpressao().relatorio(automovel,"Inclusão do Automovel " + automovel.getNome() + " realizada com sucesso!!!");
    }

    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", automoveis);

        return "automovel/lista";
    }

}
