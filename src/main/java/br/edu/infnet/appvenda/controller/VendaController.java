package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VendaController {

    @GetMapping(value = "/venda/lista")
    public String telaLista(){
        return "venda/lista";
    }

}
