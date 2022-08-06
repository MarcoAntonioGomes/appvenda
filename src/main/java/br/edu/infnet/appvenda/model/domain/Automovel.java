package br.edu.infnet.appvenda.model.domain;

public class Automovel extends Veiculo{

    public int quantidadeDePortas;
    public String tipo;
    public boolean possuiAirbag;

    @Override
    public String toString() {
        return  quantidadeDePortas + ";" + tipo + ";" + possuiAirbag  + ';' + super.toString();
    }
}
