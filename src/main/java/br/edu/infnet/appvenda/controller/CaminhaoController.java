package br.edu.infnet.appvenda.controller;




import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.service.CaminhaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class CaminhaoController {

    @Autowired
    private CaminhaoService caminhaoService;

    @GetMapping(value = "/caminhao/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        caminhaoService.excluir(id);
        return "redirect:/caminhao/lista";
    }

    @PostMapping(value = "caminhao/incluir")
    public String incluir(Caminhao caminhao, @SessionAttribute("user") Usuario usuario){

        caminhao.setUsuario(usuario);
        caminhaoService.incluir(caminhao);

        return "redirect:/caminhao/lista";
    }

    @GetMapping(value = "/caminhao")
    public String telaCadastro(){
        return "caminhao/cadastro";
    }


    @GetMapping(value = "/caminhao/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem",  caminhaoService.obterLista(usuario));

        return "caminhao/lista";
    }

}
