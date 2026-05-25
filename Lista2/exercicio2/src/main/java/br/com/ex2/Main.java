package br.com.ex2;

public class Main {
    static void main() {

        Carteirinha ct1 = new Carteirinha("8918218");

        Aluno a1 = new Aluno("José", ct1);
        Aluno a2 = new Aluno("Joseph", ct1);

        a1.exibirDados();
        a2.exibirDados();
    }
}
