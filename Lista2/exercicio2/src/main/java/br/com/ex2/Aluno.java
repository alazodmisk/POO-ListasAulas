package br.com.ex2;

public class Aluno {
    private String nome;
    private Carteirinha carteirinha;

    public Aluno(String nome, Carteirinha carteirinha) {
        this.nome = nome;
        if (carteirinha.getUsado() == false){
            this.carteirinha = carteirinha;
            carteirinha.setUsado(true);
        }
        else {
            System.out.println("Erro: Carteirinha usada || aluno: " + nome);
            this.carteirinha = null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        carteirinha.exibirDados();
    }
}
