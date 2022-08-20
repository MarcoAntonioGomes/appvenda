package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Motocicleta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MotocicletaController {

    private static List<Motocicleta> motocicletas = null;
    @GetMapping(value = "/motocicleta/lista")
    public String telaLista(Model model){

        motocicletas = new ArrayList<>();

        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.setPossuiCarenagem ( true);
        motocicleta1.setNumeroDeMarchas ( 4);
        motocicleta1.setCilindrada( 300);
        motocicleta1.setNome( "CB300");
        motocicleta1.setMarca( "Honda");
        motocicleta1.setValor( 30000);


        Motocicleta motocicleta2 = new Motocicleta();
        motocicleta2.setPossuiCarenagem ( false);
        motocicleta2.setNumeroDeMarchas ( 5);
        motocicleta2.setCilindrada( 400);
        motocicleta2.setNome( "Z400");
        motocicleta2.setMarca( "Kawasaki");
        motocicleta2.setValor( 23000);


        Motocicleta motocicleta3 = new Motocicleta();
        motocicleta3.setPossuiCarenagem ( true);
        motocicleta3.setNumeroDeMarchas ( 4);
        motocicleta3.setCilindrada( 150);
        motocicleta3.setNome( "CG Titan");
        motocicleta3.setMarca( "Honda");
        motocicleta3.setValor( 8000);

        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);

        model.addAttribute("listagem", motocicletas);

        return "motocicleta/lista";
    }

}
