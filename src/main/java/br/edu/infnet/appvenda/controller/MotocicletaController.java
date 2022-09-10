package br.edu.infnet.appvenda.controller;



import br.edu.infnet.appvenda.service.MotocicletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Controller
public class MotocicletaController {

    @Autowired
    private MotocicletaService motocicletaService;


    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem",  motocicletaService.obterLista());

        return "motocicleta/lista";
    }

    @GetMapping(value = "/motocicleta/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        motocicletaService.excluir(id);
        return "redirect:/motocicleta/lista";
    }


}
