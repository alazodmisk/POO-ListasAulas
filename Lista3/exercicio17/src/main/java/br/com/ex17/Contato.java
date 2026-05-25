package br.com.ex17;

public class Contato {
    private String numero;

    public Contato(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void exibirDados(){
        System.out.println("*******");
        System.out.println("Número: " + numero);
    }
}
