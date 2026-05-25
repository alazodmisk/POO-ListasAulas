package br.com.ex3;


public class Main {
    static void main() {

        Carro c1 = new Carro("Gurgel", "X-12", 5);
        Moto m1 = new Moto("Honda", "X-13", 160);

        m1.exibirDados();
        c1.exibirDados();
    }
}
