package br.edu.infnet.appvenda.model.domain;

public class Caminhao  extends Veiculo{

    private float capacidadeDeTransporte;
    private String tipoCarroceria;
    private float torque;


    @Override
    public void impressao() {
        System.out.println("#Caminhão");
        System.out.println(this);
    }

    @Override
    public float calcularVenda() {

        float valorPorCapacidadeDeTransporte = capacidadeDeTransporte*0.005f;
        return getValor() + valorPorCapacidadeDeTransporte;
    }

    public float getCapacidadeDeTransporte() {
        return capacidadeDeTransporte;
    }

    public void setCapacidadeDeTransporte(float capacidadeDeTransporte) {
        this.capacidadeDeTransporte = capacidadeDeTransporte;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    @Override
    public String toString() {
        return  capacidadeDeTransporte+ ";" + tipoCarroceria + ";" + torque + ';' + super.toString();
    }


}
