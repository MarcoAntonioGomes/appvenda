package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.domain.Venda;
import br.edu.infnet.appvenda.model.repository.VendaRepository;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class VendaService {

   @Autowired
   private VendaRepository vendaRepository;

    public  void incluir(Venda venda) {

        vendaRepository.save(venda);

        new AppImpressao().relatorio(venda, "Inclusão da venda " + venda.getDescricao() + " realizada com sucesso!!");
    }

    public void excluir(Integer id){
        vendaRepository.deleteById(id);
    }

    public  Collection<Venda> obterLista(){
        return (Collection<Venda>) vendaRepository.findAll();
    }

    public  Collection<Venda> obterLista(Usuario usuario){
        return (Collection<Venda>) vendaRepository.findAll(usuario.getId());
    }


}
