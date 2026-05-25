package com.aula2;

public class Main {
    public static void main(String[] args) {
        
        Livro machado = new Livro();
        
        machado.setAutor("Machado de Assis");
        machado.setTitulo("Dom Casmurro");
        machado.setAnoDePublicacao("1899");
        machado.setDisponivel(true);

        System.out.println(
            machado.getAutor() + "\n" +
            machado.getTitulo() + "\n" +
            machado.getAnoDePublicacao() + "\n" +
            machado.isDisponivel() + "\n"
        );

        machado.emprestar();
        machado.devolver();
    }
}