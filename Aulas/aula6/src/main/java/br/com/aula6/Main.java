package br.com.aula6;

public class Main {
    static void main() {

        Cachorro cao = new Cachorro("Pluto");

        System.out.println(cao.getNome() + " é um cachorro");
        cao.emitirSom();
    }
}
