package br.edu.infnet.appvenda.controller;



import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.CompradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class CompradorController {

    @Autowired
    private CompradorService compradorService;

    @GetMapping(value = "/comprador/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem", compradorService.obterLista(usuario));

        return "comprador/lista";
    }


    @GetMapping(value = "/comprador/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        compradorService.excluir(id);
        return "redirect:/comprador/lista";
    }


    @GetMapping(value = "/comprador")
    public String telaCadastro(){
        return "comprador/cadastro";
    }


    @PostMapping(value = "comprador/incluir")
    public String incluir(Comprador comprador, @SessionAttribute("user") Usuario usuario){

        comprador.setUsuario(usuario);

        compradorService.incluir(comprador);

        return "redirect:/comprador/lista";
    }

}
