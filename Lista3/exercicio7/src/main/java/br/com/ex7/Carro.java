package br.com.ex7;

public class Carro {
    private String marca;
    private String modelo;
    private int qtdPortas;

    public Carro(String marca, String modelo, int qtdPortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdPortas = qtdPortas;
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

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
}
