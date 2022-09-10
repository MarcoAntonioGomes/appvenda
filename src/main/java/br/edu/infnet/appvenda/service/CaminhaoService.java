package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CaminhaoService {

    private static Map<Integer, Caminhao> mapaCaminhao = new HashMap<>();
    private static Integer id = 1;

    public void incluir(Caminhao caminhao){

        caminhao.setId(id++);
        mapaCaminhao.put(caminhao.getId(), caminhao);

        new AppImpressao().relatorio(caminhao, "Inclusão do caminhão " + caminhao.getNome() + " realizada com sucesso!!!");
    }



    public  void excluir(Integer id){
        mapaCaminhao.remove(id);
    }

    public  Collection<Caminhao> obterLista(){
        return mapaCaminhao.values();
    }




}
