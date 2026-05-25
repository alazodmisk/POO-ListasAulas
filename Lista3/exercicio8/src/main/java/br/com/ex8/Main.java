package br.com.ex8;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Pessoa> list = new ArrayList<>(4);

        Professor p1 = new Professor("A", "A");
        Professor p2 = new Professor("A", "A");

        Aluno a1 = new Aluno("B", "B");
        Aluno a2 = new Aluno("B", "B");

        list.add(p1);
        list.add(p2);
        list.add(a1);
        list.add(a2);

        System.out.println(list);
    }
}
