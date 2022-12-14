package br.edu.infnet.appvenda.model.domain;

import br.edu.infnet.appvenda.exceptions.CapacidadeTransporteInvalidaException;
import br.edu.infnet.appvenda.exceptions.NumeroCilindradasInvalidaException;
import br.edu.infnet.appvenda.exceptions.QuantidadePortasInvalidoException;
import br.edu.infnet.appvenda.interfaces.IPrinter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "TVeiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo implements IPrinter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private  float valor;
    private  String marca;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToMany(mappedBy = "veiculos")
    private List<Venda> vendas;

    public abstract float calcularVenda() throws NumeroCilindradasInvalidaException, QuantidadePortasInvalidoException, CapacidadeTransporteInvalidaException;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        return nome + ";" + valor + ";" + marca;
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
