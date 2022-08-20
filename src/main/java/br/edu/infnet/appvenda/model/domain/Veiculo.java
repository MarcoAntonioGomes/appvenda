package br.edu.infnet.appvenda.model.domain;

import br.edu.infnet.appvenda.interfaces.IPrinter;

import java.util.Objects;

public abstract class Veiculo implements IPrinter {

    private String nome;
    private  float valor;
    private  String marca;


    public abstract float calcularVenda();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return nome + ";" + valor + ";" + marca + calcularVenda();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculo)) return false;
        Veiculo veiculo = (Veiculo) o;
        return Float.compare(veiculo.valor, valor) == 0 && Objects.equals(nome, veiculo.nome) && Objects.equals(marca, veiculo.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor, marca);
    }
}
