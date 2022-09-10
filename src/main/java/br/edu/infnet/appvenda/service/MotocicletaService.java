package br.edu.infnet.appvenda.service;

import br.edu.infnet.appvenda.model.domain.Motocicleta;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MotocicletaService {

    private static Map<Integer, Motocicleta> mapaMotocicleta = new HashMap<>();
    private static Integer id = 1;

    public void incluir (Motocicleta motocicleta){

        motocicleta.setId(id++);
        mapaMotocicleta.put(motocicleta.getId(),motocicleta);

        new AppImpressao().relatorio(motocicleta, "Inclusão da motocicleta " + motocicleta.getNome() + " realizada com sucesso !!! ");
    }


    public static void excluir(Integer id){
        mapaMotocicleta.remove(id);
    }


    public static Collection<Motocicleta> obterLista(){
        return mapaMotocicleta.values();
    }




}
