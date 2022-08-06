package br.edu.infnet.appvenda.model.domain;

public class Motocicleta extends Veiculo{

    private int cilindrada;
    private boolean possuiCarenagem;
    private int numeroDeMarchas;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isPossuiCarenagem() {
        return possuiCarenagem;
    }

    public void setPossuiCarenagem(boolean possuiCarenagem) {
        this.possuiCarenagem = possuiCarenagem;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    @Override
    public String toString() {
        return  cilindrada + ";" +  possuiCarenagem + ";" + numeroDeMarchas + ';' + super.toString();
    }

}
