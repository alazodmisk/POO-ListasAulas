package br.com.questao8;

public class Main {
    static void main() {

        Livro livro = new Livro();

        livro.setAutor("Machado de Assis");
        livro.setDisponivel(true);
        livro.setTitulo("Brás Cubas");
        livro.setAnoDePublicacao("1899");

        System.out.println(livro.isDisponivel());
        livro.emprestar();
        System.out.println(livro.isDisponivel());
        livro.devolver();
        System.out.println(livro.isDisponivel());
    }
}
