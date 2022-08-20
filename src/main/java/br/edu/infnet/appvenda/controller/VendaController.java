package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.*;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class VendaController {

    private static List<Venda> vendas  = new ArrayList<>();

   public static void incluir(Venda venda){
        vendas.add(venda);
        new AppImpressao().relatorio(venda,"Inclusão da venda " + venda.getDescricao() + " realizada com sucesso!!");
    }

    @GetMapping(value = "/venda/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", vendas);
        return "venda/lista";
    }

}
