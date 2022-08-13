package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompradorController {

    @GetMapping(value = "/comprador/lista")
    public String telaLista(){
        return "comprador/lista";
    }

}
