package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CaminhaoController {


    private static List<Caminhao> caminhoes = new ArrayList<>();

    public static void incluir(Caminhao caminhao){
        caminhoes.add(caminhao);
        new AppImpressao().relatorio(caminhao, "Inclusão do caminhão " + caminhao.getNome() + " realizada com sucesso!!!");
    }

    @GetMapping(value = "/caminhao/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", caminhoes);

        return "caminhao/lista";
    }

}
