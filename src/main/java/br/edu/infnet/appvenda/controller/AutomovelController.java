package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AutomovelController {

    @GetMapping(value = "/automovel/lista")
    public String telaLista(){
        return "automovel/lista";
    }

}
