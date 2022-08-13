package br.edu.infnet.appvenda.model.test;

import br.edu.infnet.appvenda.model.domain.Veiculo;

public class AppVeiculo {

    private static String mensagem;


    public AppVeiculo(String mensagem) {
        AppVeiculo.mensagem = mensagem;
    }

    public static void relatorio(Veiculo veiculo){
        System.out.println(mensagem);
        veiculo.impressao();
    }


}
