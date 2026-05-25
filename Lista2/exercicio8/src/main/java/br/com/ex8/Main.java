package br.com.ex8;

public class Main {
    static void main() {
        Endereco ed1 = new Endereco("A", "Zona 7", "Pintópolis", 87152710, 6769);
        Casa c1 = new Casa("Azul", "3", ed1);

        c1.exibirDados();
    }
}
