package br.com.ex4;

public class Main {
    static void main() {

        PlacaMae pm1 = new PlacaMae("Asus", "1155");

        Computador pc1 = new Computador("i5 34500F", "Lenovo", pm1);
        Computador pc2 = new Computador("i5 12500H", "Dell", pm1);

        pc1.exibirDados();
    }
}
