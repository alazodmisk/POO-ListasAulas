 package org.com.questao2.java;

public class Produto {
    private String nome;
    private int preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void exibitInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
}
