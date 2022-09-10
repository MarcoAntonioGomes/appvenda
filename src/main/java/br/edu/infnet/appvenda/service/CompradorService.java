package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompradorService {

    private static List<Comprador> compradores = new ArrayList<>();
    private static Map<Integer, Comprador> mapaComprador = new HashMap();
    private static Integer id = 1;

    public void incluir(Comprador comprador){

        comprador.setId(id++);
        mapaComprador.put(comprador.getId(), comprador);

        new AppImpressao().relatorio(comprador,"Inclusão do comprador " + comprador.getNome() + "realizada com sucesso!!!");

    }



    public void excluir(Integer id){
        mapaComprador.remove(id);
    }


    public Collection<Comprador> obterLista(){
        return mapaComprador.values();
    }


}
