package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.domain.Veiculo;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import br.edu.infnet.appvenda.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VeiculoController {


    @Autowired
    private VeiculoService veiculoService;


    @GetMapping(value = "/veiculo/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){
        model.addAttribute("listagem",  veiculoService.obterLista(usuario));
        return "veiculo/lista";
    }

    @GetMapping(value = "/veiculo/{id}/excluir")
    public String excluir(@PathVariable Integer id){
        veiculoService.excluir(id);
        return "redirect:/veiculo/lista";
    }



}
