package br.com.aula5;

public class Quadrado extends FiguraGeometrica {
    private double tamLado;


    public Quadrado(double tamLado) {
        super("quadrado", 4);
        this.tamLado = tamLado;
    }


    @Override
    public double calcularArea() {
        return tamLado*tamLado;
    }


    public double getTamLado() {
        return tamLado;
    }

    public void setTamLado(double tamLado) {
        this.tamLado = tamLado;
    }
}
