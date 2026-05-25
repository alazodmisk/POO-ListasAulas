package br.com.pudim.model;

public class Endereco {
    private String rua;
    private String cep;
    private int numero;

    public Endereco(String rua, String cep, int numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }
}
