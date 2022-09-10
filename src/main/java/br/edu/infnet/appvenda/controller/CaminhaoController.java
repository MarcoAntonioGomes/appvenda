package br.edu.infnet.appvenda.controller;



import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import br.edu.infnet.appvenda.service.CaminhaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class CaminhaoController {

    @Autowired
    private CaminhaoService caminhaoService;

    @GetMapping(value = "/caminhao/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        caminhaoService.excluir(id);
        return "redirect:/caminhao/lista";
    }



    @GetMapping(value = "/caminhao/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",  caminhaoService.obterLista());

        return "caminhao/lista";
    }

}
