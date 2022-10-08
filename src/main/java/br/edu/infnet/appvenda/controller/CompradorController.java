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
    private String mensagem;
    private String tipo;

    @GetMapping(value = "/comprador/lista")
    public String telaLista(Model model, @SessionAttribute("user") Usuario usuario){

        model.addAttribute("listagem", compradorService.obterLista(usuario));
        model.addAttribute("mensagem", mensagem);
        model.addAttribute("tipo", tipo);
        return "comprador/lista";
    }


    @GetMapping(value = "/comprador/{id}/excluir")
    public String excluir(@PathVariable Integer id){

        try{
            compradorService.excluir(id);
            mensagem =  "Exclusão do comprador " + id + "realizada com sucesso!!!";
            tipo = "alert-success";
        }catch (Exception e){
            mensagem =  "Impossivel realizar a exclusão do comprador " + id + "!!!";
            tipo = "alert-danger";
        }

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

        mensagem =  "Inclusão do comprador " + comprador.getNome() + " realizada com sucesso!!!";
        tipo = "alert-success";

        return "redirect:/comprador/lista";
    }

}
