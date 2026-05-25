package br.com.questao9;

public class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria;

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

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public void carregar(int valor){
        if (nivelBateria + valor > 100) {
            System.out.println("Carregado até 100% (Valor carregado excede bateria)");
            nivelBateria = 100;
        } else {
            nivelBateria = nivelBateria + valor;
            System.out.println("Carregado até: " + nivelBateria);
        }
    }

    public void usar(int valor){
        if (nivelBateria - valor < 0){
            System.out.println("Utilizou até 0% (Valor descarregado excede 0%)");
            nivelBateria = 0;
        } else {
            nivelBateria = nivelBateria - valor;
            System.out.println("Bateria atual: " + nivelBateria);
        }
    }
}
