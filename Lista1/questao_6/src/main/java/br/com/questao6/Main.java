package br.com.questao6;

public class Main {
    static void main() {

        Carro carro = new Carro();

        carro.setMarca("Fiat");
        carro.setMoedelo("cronso");
        carro.setVelocidade(0);

        carro.acelerar(50.00);
        System.out.println(carro.mostrarVelocidade());
        carro.frear(20.00);
        System.out.println(carro.mostrarVelocidade());
        carro.frear(80.00);
    }
}
