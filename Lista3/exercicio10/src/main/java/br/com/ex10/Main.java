package br.com.ex10;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("AA", 10.00);
        Produto p2 = new Produto("BB", 12.00);
        Produto p3 = new Produto("CC", 15.00);
        Produto p4 = new Produto("DD", 17.00);
        Produto p5 = new Produto("EE", 20.00);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        for (Produto i : lista){
            i.exibirDados();
        }

        String nome = "CC";

        for (Produto i : lista){
            if (i.getNome() == nome){
                i.exibirDados();
                break;
            }
        }

        Produto maior = p1;

        for (Produto i : lista){
            if (i.getPreco() > maior.getPreco()){
                maior = i;
            }
        }
        maior.exibirDados();
    }
}
