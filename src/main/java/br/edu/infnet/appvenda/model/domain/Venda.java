package br.edu.infnet.appvenda.model.domain;

import br.edu.infnet.appvenda.interfaces.IPrinter;

import java.time.LocalDateTime;
import java.util.Set;

public class Venda implements IPrinter {

    private Integer id;
    private String descricao;
    private LocalDateTime data;
    private boolean avista;
    private Comprador comprador;
    private Set<Veiculo> veiculos;

    public Venda(Comprador comprador) {
        this.comprador = comprador;
        this.data =  LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public boolean isAvista() {
        return avista;
    }

    public void setAvista(boolean avista) {
        this.avista = avista;
    }


    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return descricao + ";" +data + ";" +avista + ";" + comprador + ";" + "Quantidade de Veículos: " + veiculos.size();
    }

    @Override
    public void impressao() {
        System.out.println("#Venda");
        System.out.println(this);
    }
}
