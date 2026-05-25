package br.com.ex2;

public class Carteirinha {
    private String numero;
    private Boolean usado;

    public Carteirinha(String numero) {
        this.numero = numero;
        usado = false;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public void exibirDados(){
        System.out.println("Numero: " + numero);
        System.out.println("Situação: " + usado);
    }
}
