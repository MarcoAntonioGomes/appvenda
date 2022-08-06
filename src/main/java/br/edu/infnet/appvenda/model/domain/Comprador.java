package br.edu.infnet.appvenda.model.domain;

public class Comprador {

    public String nome;
    public String cpf;
    public String email;

    public Comprador(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ";" + cpf + ";" + email;
    }

}
