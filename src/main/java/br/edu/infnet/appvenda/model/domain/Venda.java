package br.edu.infnet.appvenda.model.domain;

import br.edu.infnet.appvenda.exceptions.CompradorNuloException;
import br.edu.infnet.appvenda.exceptions.VendaSemVeiculosException;
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

    public Venda(Comprador comprador, Set<Veiculo> veiculos) throws CompradorNuloException, VendaSemVeiculosException {

       if(comprador == null){
           throw new CompradorNuloException("Impossivel criar um pedido sem um solicitante");
       }

        if(veiculos == null){
            throw new VendaSemVeiculosException("Impossivel criar uma venda sem veículos");
        }


        if(veiculos.size() < 1){
           throw new VendaSemVeiculosException("Impossivel criar uma venda sem veículos");
       }

        this.comprador = comprador;
        this.data =  LocalDateTime.now();
        this.veiculos = veiculos;
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

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
