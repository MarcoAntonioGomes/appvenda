package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsuarioController {

    private static Map<String, Usuario> mapaUsuario = new HashMap<>();
    private static Integer id = 1;

    public static void incluir(Usuario usuario){

        mapaUsuario.put(usuario.getEmail(), usuario);
        new AppImpressao().relatorio(usuario,"Inclusão do usuario " +usuario.getNome() + " realizada com sucesso!!!");
    }

    @GetMapping(value = "/usuario/{email}/excluir")
    public String exclusao(@PathVariable String email){

        excluir(email);
        return "redirect://lista";
    }

    public static void excluir(String email){
        mapaUsuario.remove(email);
    }

    public static Collection<Usuario> obterLista(){
        return mapaUsuario.values();
    }

    @GetMapping(value = "/usuario/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "usuario/lista";
    }

}
