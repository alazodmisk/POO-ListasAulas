package br.com.ex3;

import javax.xml.transform.Source;

public class Motor {
    private String tipo;
    private String potencia;
    private String numeroSerie;
    private boolean usado;

    public Motor(String tipo, String potencia, String numeroSerie) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie;
        this.usado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public void exibirDados(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Numero de série: " + numeroSerie);
        System.out.println("Situação: " + usado);
    }
}
