package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.service.AutomovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AutomovelController {

   @Autowired
   private AutomovelService automovelService;

    @GetMapping(value = "/automovel/{id}/excluir")
    public String exclusao(@PathVariable Integer id){
        automovelService.excluir(id);
        return "redirect:/automovel/lista";
    }


    @PostMapping(value = "automovel/incluir")
    public String incluir(Automovel automovel){

        automovelService.incluir(automovel);

        return "redirect:/automovel/lista";
    }

    @GetMapping(value = "/automovel")
    public String telaCadastro(){
        return "automovel/cadastro";
    }



    @GetMapping(value = "/automovel/lista")
    public String telaLista(Model model){
        model.addAttribute("listagem", automovelService.obterLista());
        return "automovel/lista";
    }

}
