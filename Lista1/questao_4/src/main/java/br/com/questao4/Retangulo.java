package br.com.questao4;

public class Retangulo {
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculaArea(){
        return base * altura;
    }

    public double calculaPerimetro(){
        return base*2 + altura*2;
    }
}
