package org.com.questao2.java;

public class Main {
    static void main() {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("Perfume");
        produto1.setPreco(500);

        produto2.setNome("Sabonete");
        produto2.setPreco(15);

        produto1.exibitInformacoes();
        produto2.exibitInformacoes();

    }
}
