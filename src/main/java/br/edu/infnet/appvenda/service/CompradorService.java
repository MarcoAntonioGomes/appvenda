package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Comprador;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.repository.CompradorRepository;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CompradorService {

    @Autowired
    private CompradorRepository compradorRepository;


    public void incluir(Comprador comprador){

        compradorRepository.save(comprador);
        new AppImpressao().relatorio(comprador,"Inclusão do comprador " + comprador.getNome() + "realizada com sucesso!!!");

    }



    public void excluir(Integer id){

        compradorRepository.deleteById(id);

    }


    public Collection<Comprador> obterLista(){
        return (Collection<Comprador>) compradorRepository.findAll();
    }


    public Collection<Comprador> obterLista(Usuario usuario){
        return  compradorRepository.obterLista(usuario.getId());
    }



}
