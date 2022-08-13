package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MotocicletaController {

    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(){
        return "motocicleta/lista";
    }

}
