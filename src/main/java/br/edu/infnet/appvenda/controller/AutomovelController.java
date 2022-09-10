package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class AutomovelController {

   @Autowired
   private AutomovelService automovelService;

    @GetMapping(value = "/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        automovelService.excluir(id);
        return "redirect:/automovel/lista";
    }




    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", automovelService.obterLista());
        return "automovel/lista";
    }

}
