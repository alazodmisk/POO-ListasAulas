package br.com.pudim.model;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String CPF;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade, String CPF, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String falar(){
        return "hello world";
    }
}
