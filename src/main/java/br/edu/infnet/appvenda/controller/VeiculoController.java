package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.domain.Veiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VeiculoController {

    private static List<Veiculo> veiculos = null;

    @GetMapping(value = "/veiculo/lista")
    public String telaLista(Model model){

        veiculos = new ArrayList<>();


        Automovel automovel1 = new Automovel();
        automovel1.setPossuiAirbag(true);
        automovel1.setQuantidadeDePortas(4);
        automovel1.setTipo("Carro comum");
        automovel1.setNome("Gol");
        automovel1.setValor(30000);
        automovel1.setMarca("Volkswagen");

        Caminhao caminhao2 = new Caminhao();
        caminhao2.setCapacidadeDeTransporte( 9000);
        caminhao2.setTipoCarroceria( "Plataforma");
        caminhao2.setTorque( 300);
        caminhao2.setNome( "45s14");
        caminhao2.setMarca( "Iveco");
        caminhao2.setValor(  100000);

        Motocicleta motocicleta3 = new Motocicleta();
        motocicleta3.setPossuiCarenagem ( true);
        motocicleta3.setNumeroDeMarchas ( 4);
        motocicleta3.setCilindrada( 150);
        motocicleta3.setNome( "CG Titan");
        motocicleta3.setMarca( "Honda");
        motocicleta3.setValor( 8000);

        veiculos.add(automovel1);
        veiculos.add(caminhao2);
        veiculos.add(motocicleta3);

        model.addAttribute("listagem", veiculos);

        return "veiculo/lista";
    }

}
