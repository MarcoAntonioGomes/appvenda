package br.edu.infnet.appvenda.controller;


import br.edu.infnet.appvenda.model.domain.Caminhao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CaminhaoController {


    private static List<Caminhao> caminhoes =  null;

    @GetMapping(value = "/caminhao/lista")
    public String telaLista(Model model){

        caminhoes = new ArrayList<>();

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setCapacidadeDeTransporte( 13000);
        caminhao1.setTipoCarroceria( "Bau");
        caminhao1.setTorque( 500);
        caminhao1.setNome( "Vertis");
        caminhao1.setMarca( "Iveco");
        caminhao1.setValor(  200000);



        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);



        Caminhao caminhao3 = new Caminhao();
        caminhao3.setCapacidadeDeTransporte( 10000);
        caminhao3.setTipoCarroceria( "Prancha");
        caminhao3.setTorque( 400);
        caminhao3.setNome( "1313");
        caminhao3.setMarca( "Volvo");
        caminhao3.setValor(  150000);

        caminhoes.add(caminhao1);
        caminhoes.add(caminhao2);
        caminhoes.add(caminhao3);

        model.addAttribute("listagem", caminhoes);

        return "caminhao/lista";
    }

}
