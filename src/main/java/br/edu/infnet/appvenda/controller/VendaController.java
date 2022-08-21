package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.*;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;


@Controller
public class VendaController {

    private static Map<Integer, Venda> mapaVenda = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Venda venda) {

        venda.setId(id++);
        mapaVenda.put(venda.getId(), venda);

        new AppImpressao().relatorio(venda, "Inclusão da venda " + venda.getDescricao() + " realizada com sucesso!!");
    }

    @GetMapping(value = "/venda/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);
        return "redirect:/venda/lista";
    }


    public static void excluir(Integer id){
        mapaVenda.remove(id);
    }


    public static Collection<Venda> obterLista(){
        return mapaVenda.values();
    }


    @GetMapping(value = "/venda/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", obterLista());
        return "venda/lista";
    }

}
