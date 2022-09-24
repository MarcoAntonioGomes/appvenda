package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Caminhao;
import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.domain.Usuario;
import br.edu.infnet.appvenda.model.repository.MotocicletaRepository;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MotocicletaService {

    @Autowired
    private MotocicletaRepository motocicletaRepository;

    public void incluir (Motocicleta motocicleta){

        motocicletaRepository.save(motocicleta);
        new AppImpressao().relatorio(motocicleta, "Inclusão da motocicleta " + motocicleta.getNome() + " realizada com sucesso !!! ");
    }


    public void excluir(Integer id){
        motocicletaRepository.deleteById(id);
    }


    public Collection<Motocicleta> obterLista(){
        return (Collection<Motocicleta>) motocicletaRepository.findAll();
    }

    public  Collection<Motocicleta> obterLista(Usuario usuario){
        return (Collection<Motocicleta>)  motocicletaRepository.findAll(usuario.getId());
    }


}
