package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CaminhaoController {

    @GetMapping(value = "/caminhao/lista")
    public String telaLista(){
        return "caminhao/lista";
    }

}
