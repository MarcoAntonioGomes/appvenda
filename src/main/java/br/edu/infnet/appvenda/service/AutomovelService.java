package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.Automovel;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.repository.AutomovelRepository;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AutomovelService {

    @Autowired
    private AutomovelRepository automovelRepository;

    public void incluir(Automovel automovel){

        automovelRepository.save(automovel);

        new AppImpressao().relatorio(automovel,"Inclusão do Automovel " + automovel.getNome() + " realizada com sucesso!!!");
    }

    public void excluir(Integer id){
        automovelRepository.deleteById(id);
    }

    public  Collection<Automovel> obterLista(){
        return (Collection<Automovel>) automovelRepository.findAll();
    }

    public  Collection<Automovel> obterLista(Usuario usuario){
        return (Collection<Automovel>) automovelRepository.findAll(usuario.getId());
    }

}
