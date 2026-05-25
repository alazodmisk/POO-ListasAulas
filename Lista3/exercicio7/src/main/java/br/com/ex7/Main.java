package br.com.ex7;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Carro> carros = new ArrayList<>(4);

        Carro c1 = new Carro("A", "A", 2);
        Carro c2 = new Carro("A", "A", 2);
        Carro c3 = new Carro("A", "A", 2);
        Carro c4 = new Carro("A", "A", 2);

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
    }
}
