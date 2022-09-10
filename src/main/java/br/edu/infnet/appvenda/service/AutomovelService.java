package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AutomovelService {

    private static Map<Integer, Automovel> mapaAutomovel = new HashMap<>();
    private static Integer id = 1;

    public void incluir(Automovel automovel){

        automovel.setId(id++);
        mapaAutomovel.put(automovel.getId(),automovel);

        new AppImpressao().relatorio(automovel,"Inclusão do Automovel " + automovel.getNome() + " realizada com sucesso!!!");
    }

    public void excluir(Integer id){
        mapaAutomovel.remove(id);
    }

    public  Collection<Automovel> obterLista(){
        return mapaAutomovel.values();
    }


}
