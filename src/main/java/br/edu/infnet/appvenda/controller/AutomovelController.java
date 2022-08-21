package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AutomovelController {

    private static Map<Integer, Automovel> mapaAutomovel = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Automovel automovel){

        automovel.setId(id++);
        mapaAutomovel.put(automovel.getId(),automovel);

        new AppImpressao().relatorio(automovel,"Inclusão do Automovel " + automovel.getNome() + " realizada com sucesso!!!");
    }

    @GetMapping(value = "/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);
        return "redirect:/automovel/lista";
    }


    public static void excluir(Integer id){
        mapaAutomovel.remove(id);
    }

    public static Collection<Automovel> obterLista(){
        return mapaAutomovel.values();
    }

    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "automovel/lista";
    }

}
