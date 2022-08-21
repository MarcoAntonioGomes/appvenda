package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Controller
public class MotocicletaController {

    private static Map<Integer, Motocicleta> mapaMotocicleta = new HashMap<>();
    private static Integer id = 1;

    public static void incluir (Motocicleta motocicleta){

        motocicleta.setId(id++);
        mapaMotocicleta.put(motocicleta.getId(),motocicleta);

        new AppImpressao().relatorio(motocicleta, "Inclusão da motocicleta " + motocicleta.getNome() + " realizada com sucesso !!! ");
    }


    @GetMapping(value = "/motocicleta/{id}/excluir")
    public String exclusao(@PathVariable Integer id){

        excluir(id);
        return "redirect:/motocicleta/lista";
    }


    public static void excluir(Integer id){
        mapaMotocicleta.remove(id);
    }


    public static Collection<Motocicleta> obterLista(){
        return mapaMotocicleta.values();
    }


    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", obterLista());

        return "motocicleta/lista";
    }

}
