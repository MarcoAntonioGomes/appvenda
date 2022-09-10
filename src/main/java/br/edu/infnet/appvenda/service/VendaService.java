package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Venda;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VendaService {

    private static Map<Integer, Venda> mapaVenda = new HashMap<>();
    private static Integer id = 1;

    public  void incluir(Venda venda) {

        venda.setId(id++);
        mapaVenda.put(venda.getId(), venda);

        new AppImpressao().relatorio(venda, "Inclusão da venda " + venda.getDescricao() + " realizada com sucesso!!");
    }

    public void excluir(Integer id){
        mapaVenda.remove(id);
    }

    public  Collection<Venda> obterLista(){
        return mapaVenda.values();
    }



}
