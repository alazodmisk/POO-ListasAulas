package br.com.questao6;

public class Carro {
    private String marca;
    private String moedelo;
    private double velocidade;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMoedelo() {
        return moedelo;
    }

    public void setMoedelo(String moedelo) {
        this.moedelo = moedelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void acelerar(double valor){
        this.velocidade = this.velocidade + valor;
    }

    public void frear(double valor){
        if (valor>this.velocidade){
            System.out.println("O carro parou");
            this.velocidade = 0;
        } else {
            this.velocidade = this.velocidade - valor;
        }
    }

    public double mostrarVelocidade(){
        return velocidade;
    }
}
