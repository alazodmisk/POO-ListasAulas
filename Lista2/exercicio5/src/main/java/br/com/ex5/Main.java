package br.com.ex5;

public class Main {
    static void main() {
        ISBN isbn1 = new ISBN("Uem", "1261ABP09");
        Livro l1 = new Livro("Circuitos Digitais", "Nardenio", isbn1);

        l1.exibirDados();
    }
}
