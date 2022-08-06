package br.edu.infnet.appvenda.model.domain;

public class Motocicleta extends Veiculo{

    public int cilindrada;
    public boolean possuiCarenagem;
    public int numeroDeMarchas;

    @Override
    public String toString() {
        return  cilindrada + ";" +  possuiCarenagem + ";" + numeroDeMarchas + ';' + super.toString();
    }

}
