package br.com.ex5;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;

    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
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

    public ISBN getIsbn() {
        return isbn;
    }

    public void exibirDados() {
        System.out.println("**********");
        System.out.println("Autor " + autor);
        System.out.println("Titulo " + titulo);
        isbn.exibirDados();
    }
}
