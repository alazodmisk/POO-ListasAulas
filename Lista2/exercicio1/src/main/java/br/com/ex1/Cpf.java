package br.com.ex1;

public class Cpf {
    private String numero;
    private String situacao;

    public Cpf(String numero, String situacao) {
        this.numero = numero;
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void exibirDados(){
        System.out.println("CPF de numero: " + numero);
        System.out.println("Situação do CPF: " + situacao);
    }
}
