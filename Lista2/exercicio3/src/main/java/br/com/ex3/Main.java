package br.com.ex3;

public class Main {
    static void main() {

        Motor mt1 = new Motor("v8", "500 cavalos", "123098");

        Carro car1 = new Carro("Fiat", "Cronos", mt1);
        Carro car2 = new Carro("Ford", "NãoConheçoModelosDeCarro", mt1);

        car1.exibirDados();
        car1.ligarCarro();

        car2.ligarCarro();
    }
}
