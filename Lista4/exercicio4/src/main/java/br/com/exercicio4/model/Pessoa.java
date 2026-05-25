package br.com.exercicio4.model;

public class Pessoa {
    private String nome;
    private StatusPessoa statusPessoa;

    public Pessoa(String nome, StatusPessoa statusPessoa) {
        this.nome = nome;
        this.statusPessoa = statusPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusPessoa getStatusPessoa() {
        return statusPessoa;
    }
}
