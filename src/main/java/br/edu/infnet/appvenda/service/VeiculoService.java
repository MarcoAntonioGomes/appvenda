package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private AutomovelService automovelService;
    @Autowired
    private  MotocicletaService motocicletaService;
    @Autowired
    private  CaminhaoService caminhaoService;


    public List<Veiculo> obterLista(){

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        veiculos.addAll(automovelService.obterLista());
        veiculos.addAll(motocicletaService.obterLista());
        veiculos.addAll(caminhaoService.obterLista());

        return veiculos;
    }

}
