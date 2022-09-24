package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.repository.CaminhaoRepository;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class CaminhaoService {

    @Autowired
    private CaminhaoRepository caminhaoRepository;


    public void incluir(Caminhao caminhao){

        caminhaoRepository.save(caminhao);

        new AppImpressao().relatorio(caminhao, "Inclusão do caminhão " + caminhao.getNome() + " realizada com sucesso!!!");
    }



    public  void excluir(Integer id){
        caminhaoRepository.deleteById(id);
    }

    public  Collection<Caminhao> obterLista(){
        return (Collection<Caminhao>) caminhaoRepository.findAll();
    }

    public  Collection<Caminhao> obterLista(Usuario usuario){
        return (Collection<Caminhao>) caminhaoRepository.findAll(usuario.getId());
    }



}
