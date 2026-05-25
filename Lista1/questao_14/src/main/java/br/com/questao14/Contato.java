package br.com.questao14;

import java.util.Scanner;

public class Contato {
    private String nome;
    private String telefone;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void exibirContato(){
        System.out.println("----------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }


    public void atulizarTelefone(String novoTelefone){
        telefone = novoTelefone;
        System.out.println("Telefone atualizado para: " + telefone);
    }
}
