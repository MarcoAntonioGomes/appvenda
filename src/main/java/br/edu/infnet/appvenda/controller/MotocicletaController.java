package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MotocicletaController {

    private static List<Motocicleta> motocicletas =  new ArrayList<>();

    public static void incluir (Motocicleta motocicleta){
        motocicletas.add(motocicleta);
        new AppImpressao().relatorio(motocicleta, "Inclusão da motocicleta " + motocicleta.getNome() + " realizada com sucesso !!! ");
    }

    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", motocicletas);

        return "motocicleta/lista";
    }

}
