package br.edu.infnet.appvenda.model.domain;

import br.edu.infnet.appvenda.interfaces.IPrinter;

import java.time.LocalDateTime;

public class Venda implements IPrinter {

    private String descricao;
    private LocalDateTime data;
    private boolean avista;
    private Comprador comprador;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isAvista() {
        return avista;
    }

    public void setAvista(boolean avista) {
        this.avista = avista;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return descricao + ";" +data + ";" +avista + ";" + comprador;
    }

    @Override
    public void impressao() {
        System.out.println("#Venda");
        System.out.println(this);
    }
}
