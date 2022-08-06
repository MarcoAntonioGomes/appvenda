package br.edu.infnet.appvenda.model.domain;

import java.time.LocalDateTime;

public class Venda {

    public String descricao;
    public LocalDateTime data;
    public boolean avista;

    @Override
    public String toString() {
        return descricao + ";" +data + ";" +avista;
    }
}
