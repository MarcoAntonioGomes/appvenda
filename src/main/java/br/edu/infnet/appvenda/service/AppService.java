package br.edu.infnet.appvenda.service;


import br.edu.infnet.appvenda.model.domain.app.Projeto;
import br.edu.infnet.appvenda.model.test.AppImpressao;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    private Projeto projeto;

    public void incluir(Projeto projeto){
        this.projeto = projeto;
        new AppImpressao().relatorio(projeto,"Exibição do projeto " + projeto.getNome() + "realizada com sucesso!!!");
    }


    public Projeto obterProjeto(){
        return projeto;
    }


}
