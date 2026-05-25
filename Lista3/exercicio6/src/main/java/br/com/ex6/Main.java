package br.com.ex6;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno a1 =new Aluno("Aluno1", "CC");
        Aluno a2 =new Aluno("Aluno2", "CA");
        Aluno a3 =new Aluno("Aluno3", "CB");

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        System.out.println(alunos);
    }
}
