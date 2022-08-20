package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class CompradorController {

    private static List<Comprador> compradores = new ArrayList<>();
    private static Map<Integer, Comprador> mapaComprador = new HashMap();
    private static Integer id = 1;

    public static void incluir(Comprador comprador){

        comprador.setId(id++);
        mapaComprador.put(comprador.getId(), comprador);

        new AppImpressao().relatorio(comprador,"Inclusão do comprador " + comprador.getNome() + "realizada com sucesso!!!");

    }

    public static Collection<Comprador> obterLista(){
        return mapaComprador.values();
    }

    @GetMapping(value = "/comprador/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "comprador/lista";
    }

}
