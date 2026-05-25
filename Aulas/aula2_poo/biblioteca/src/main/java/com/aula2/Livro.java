package com.aula2;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private boolean disponivel;

    //Métodos

    public Livro(){
    }

    //get e setter titulo
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //get e setter autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //get e setter anoDePublicacao
    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    //get e setter disponivel
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("O livro " + titulo + " foi emprestado com sucesso");
        }else{
            System.out.println("O livro " + titulo + " está indisponível");
        }
    }

    public void devolver(){
        if (disponivel == false) {
            this.disponivel = true;
            System.out.println("O livro " + titulo + " foi devolvido com sucesso");
        }else{
            System.out.println("O livro já foi devolvido");
        }
    }
}
