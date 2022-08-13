package br.edu.infnet.appvenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VeiculoController {

    @GetMapping(value = "/veiculo/lista")
    public String telaLista(){
        return "veiculo/lista";
    }

}
