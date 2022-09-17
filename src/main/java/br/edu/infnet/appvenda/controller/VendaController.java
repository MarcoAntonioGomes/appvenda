package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.service.CompradorService;
import br.edu.infnet.appvenda.service.VeiculoService;
import br.edu.infnet.appvenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class VendaController {


    @Autowired
    private VendaService vendaService;

    @Autowired
    private CompradorService compradorService;

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping(value = "/venda/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", vendaService.obterLista());
        return "venda/lista";
    }


    @GetMapping(value = "/venda")
    public String telaCadastro(Model model) {

        model.addAttribute("compradores", compradorService.obterLista());
        model.addAttribute("veiculos", veiculoService.obterLista());

        return "venda/cadastro";
    }

    @GetMapping(value = "/venda/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        vendaService.excluir(id);
        return "redirect:/venda/lista";
    }

    @PostMapping(value = "/venda/incluir")
    public String incluir(){


        return "redirect:/venda/lista";
    }

}
