package br.edu.infnet.appvenda.controller;

import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.domain.Veiculo;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VeiculoController {

    private static List<Veiculo> veiculos = new ArrayList<>();

    public static void incluir(Veiculo veiculo){
        veiculos.add(veiculo);
        new AppImpressao().relatorio(veiculo, "Inclusão do Veiculo " + veiculo.getNome() + " realizada com sucesso !!! ");
    }

    @GetMapping(value = "/veiculo/lista")
    public String telaLista(Model model){

        model.addAttribute("listagem", veiculos);

        return "veiculo/lista";
    }

}
