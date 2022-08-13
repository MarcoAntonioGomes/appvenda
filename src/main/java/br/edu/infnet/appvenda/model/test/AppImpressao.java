package br.edu.infnet.appvenda.model.test;

import br.edu.infnet.appvenda.interfaces.IPrinter;
import br.edu.infnet.appvenda.model.domain.Veiculo;

public class AppImpressao {


    public static void relatorio(IPrinter printer, String mensagem){
        System.out.println(mensagem);
        printer.impressao();
    }


}
