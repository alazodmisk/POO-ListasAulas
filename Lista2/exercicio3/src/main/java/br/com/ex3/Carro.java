package br.com.ex3;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        if (motor.isUsado() == false){
            this.motor = motor;
            motor.setUsado(true);
        }
        else {
            this.motor = null;
            System.out.println("Erro: Motor usado || Carro: " + modelo + " " + marca);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void ligarCarro(){
        if (motor != null){
            System.out.println("=================");
            System.out.println("Carro Ligado");
        }
        else {
            System.out.println("=================");
            System.out.println("Tá sem motor fih");
        }
    }

    public void exibirDados(){
        System.out.println("=================");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Infos Motor======");
        motor.exibirDados();
    }
}
