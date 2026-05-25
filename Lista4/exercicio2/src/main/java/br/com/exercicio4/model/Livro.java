package br.com.exercicio4.model;

public class Livro {
    private String titulo;
    private String autor;
    private StatusLivro statusLivro;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.statusLivro = StatusLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }

    public void exibirDados(){
        System.out.println("*************");
        System.out.println("Titulo: " + titulo + " | do Autor: " + autor);
        if(statusLivro == StatusLivro.DISPONIVEL){
            System.out.println("Livro disponível");
        }else{
            System.out.println("Livro indisponível");
        }
    }
}
