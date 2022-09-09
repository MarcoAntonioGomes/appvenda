package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsuarioController {

   private UsuarioService usuarioService = new UsuarioService();

    @GetMapping(value = "/usuario/{email}/excluir")
    public String excluir(@PathVariable String email){

        usuarioService.excluir(email);
        return "redirect:/usuario/lista";
    }


    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", usuarioService.obterLista());

        return "usuario/lista";
    }

    @GetMapping(value = "/usuario")
    public String telaCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/usuario/incluir")
    public String incluir(Usuario usuario){
        usuarioService.incluir(usuario);
        return "redirect:/";
    }




}
