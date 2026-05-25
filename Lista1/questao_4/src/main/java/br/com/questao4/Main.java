package br.com.questao4;

public class Main {
    static void main() {

        Retangulo retangulo = new Retangulo();

        retangulo.setBase(20.2);
        retangulo.setAltura(40.5);

        System.out.println(retangulo.calculaArea());
        System.out.println(retangulo.calculaPerimetro());
    }
}
