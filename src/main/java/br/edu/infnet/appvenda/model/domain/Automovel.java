package br.edu.infnet.appvenda.model.domain;

public class Automovel extends Veiculo{

    private int quantidadeDePortas;
    private String tipo;
    private boolean possuiAirbag;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPossuiAirbag() {
        return possuiAirbag;
    }

    public void setPossuiAirbag(boolean possuiAirbag) {
        this.possuiAirbag = possuiAirbag;
    }

    @Override
    public void impressao() {
        System.out.println("#Automovel");
        System.out.println(this);
    }

    @Override
    public float calcularVenda() {
        float valorPorQuantidadeDePortas = quantidadeDePortas == 4 ? 1000 : 500;
        float valorPorPossuirAirbag = possuiAirbag ? 2000 : 0;
        return getValor() * 2 + valorPorQuantidadeDePortas + valorPorPossuirAirbag;
    }

    @Override
    public String toString() {
        return  quantidadeDePortas + ";" + tipo + ";" + possuiAirbag  + ';' + super.toString();
    }
}
