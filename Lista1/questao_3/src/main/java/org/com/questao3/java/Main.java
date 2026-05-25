package org.com.questao3.java;

public class Main {
    static void main() {

        Aluno aluno1 = new Aluno();

        aluno1.setNota1(5.2);
        aluno1.setNota2(9.0);
        aluno1.setMatricula("ra1432527");
        aluno1.setNome("Luciano vianna");

        aluno1.calculaMedia();
        aluno1.verificarSituacao();
        System.out.println(aluno1.getMatricula() + " " + aluno1.getNome());
    }
}
