package br.edu.infnet.appvenda.model.domain;

public abstract class Veiculo {

    private String nome;
    private  float valor;
    private  String marca;

    public abstract void impressao();

    public float calcularVenda(){
        System.out.println("Calcular venda mãe");
        return valor * 2;
    }

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
}
