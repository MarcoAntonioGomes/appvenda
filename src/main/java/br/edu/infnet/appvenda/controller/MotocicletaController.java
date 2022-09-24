package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.MotocicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class MotocicletaController {

    @Autowired
    private MotocicletaService motocicletaService;


    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem",  motocicletaService.obterLista(usuario));

        return "motocicleta/lista";
    }

    @PostMapping(value = "motocicleta/incluir")
    public String incluir(Motocicleta motocicleta, @SessionAttribute("user") Usuario usuario){

        motocicleta.setUsuario(usuario);
        motocicletaService.incluir(motocicleta);

        return "redirect:/motocicleta/lista";
    }

    @GetMapping(value = "/motocicleta")
    public String telaCadastro(){
        return "motocicleta/cadastro";
    }


    @GetMapping(value = "/motocicleta/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        motocicletaService.excluir(id);
        return "redirect:/motocicleta/lista";
    }


}
