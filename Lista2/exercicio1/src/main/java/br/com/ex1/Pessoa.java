package br.com.ex1;

public class Pessoa {
    private String nome;
    private Cpf cpf;

    public Pessoa(String nome, Cpf cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println("===Infos Pessoa==================");
        System.out.println("Nome: " + nome);
        System.out.println("===Infos CPF=====================");
        cpf.exibirDados();
    }
}
