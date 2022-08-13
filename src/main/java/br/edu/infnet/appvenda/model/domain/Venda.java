package br.edu.infnet.appvenda.model.domain;

import java.time.LocalDateTime;

public class Venda {

    private String descricao;
    private LocalDateTime data;
    private boolean avista;

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

    public void impressao() {
        System.out.println("#Venda");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return descricao + ";" +data + ";" +avista;
    }
}
