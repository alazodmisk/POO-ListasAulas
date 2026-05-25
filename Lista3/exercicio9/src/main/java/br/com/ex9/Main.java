package br.com.ex9;

import java.util.ArrayList;

public class Main {
    static void main() {
        int counter = 0;

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("A");
        nomes.add("B");
        nomes.add("C");
        nomes.add("D");
        nomes.add("E");

        for (String i : nomes){
            System.out.println(i);
            counter++;
        }

        System.out.println(counter);
    }
}
