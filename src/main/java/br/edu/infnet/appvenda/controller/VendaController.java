package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.domain.Venda;
import br.edu.infnet.appvenda.service.CompradorService;
import br.edu.infnet.appvenda.service.VeiculoService;
import br.edu.infnet.appvenda.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;


@Controller
public class VendaController {


    @Autowired
    private VendaService vendaService;

    @Autowired
    private CompradorService compradorService;

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping(value = "/venda/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("listagem", vendaService.obterLista(usuario));
        return "venda/lista";
    }


    @GetMapping(value = "/venda")
    public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("compradores", compradorService.obterLista(usuario));
        model.addAttribute("veiculos", veiculoService.obterLista(usuario));

        return "venda/cadastro";
    }

    @GetMapping(value = "/venda/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        vendaService.excluir(id);
        return "redirect:/venda/lista";
    }

    @PostMapping(value = "/venda/incluir")
    public String incluir(Venda venda, @SessionAttribute("user") Usuario usuario){

        venda.setUsuario(usuario);
        vendaService.incluir(venda);

        return "redirect:/venda/lista";
    }

}
