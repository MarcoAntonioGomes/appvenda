package br.edu.infnet.appvenda.model.domain;

public class Veiculo {

    public String nome;
    public float valor;
    public String marca;

    @Override
    public String toString() {
        return nome + ";" + valor + ";" + marca;
    }
}
