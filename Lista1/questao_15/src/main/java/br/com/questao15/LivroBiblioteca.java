package br.com.questao15;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class LivroBiblioteca {
    //Atributos
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponivel;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

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

    public void exibirInformacoes(){
        System.out.println("----------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Codigo: " + codigo);
        System.out.println("Status: " + disponivel);
        System.out.println("----------------------");
    }
}
