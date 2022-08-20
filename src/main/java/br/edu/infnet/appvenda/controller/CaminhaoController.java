package br.edu.infnet.appvenda.controller;



import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class CaminhaoController {


    private static Map<Integer, Caminhao> mapaCaminhao = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Caminhao caminhao){

        caminhao.setId(id++);
        mapaCaminhao.put(caminhao.getId(), caminhao);

        new AppImpressao().relatorio(caminhao, "Inclusão do caminhão " + caminhao.getNome() + " realizada com sucesso!!!");
    }


    public static Collection<Caminhao> obterLista(){
        return mapaCaminhao.values();
    }


    @GetMapping(value = "/caminhao/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "caminhao/lista";
    }

}
