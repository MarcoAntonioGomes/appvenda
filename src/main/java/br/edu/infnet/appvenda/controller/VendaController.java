package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@Controller
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping(value = "/venda/lista")
    public String telaLista(Model model) {

        model.addAttribute("listagem", vendaService.obterLista());
        return "venda/lista";
    }

    @GetMapping(value = "/venda/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        vendaService.excluir(id);
        return "redirect:/venda/lista";
    }

}
