package br.edu.infnet.appvenda.model.domain;

public class Caminhao  extends Veiculo{

    public float capacidadeDeTransporte;
    public String tipoCarroceria;
    public float torque;

    @Override
    public String toString() {
        return  capacidadeDeTransporte+ ";" + tipoCarroceria + ";" + torque + ';' + super.toString();
    }


}
