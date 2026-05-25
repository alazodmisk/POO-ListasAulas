package br.com.ex1;


public class Main {
    static void main() {

        Aluno a1 = new Aluno("Aline", 18, "12345", "geografia");
        a1.exibirDados();

        Professor p1 = new Professor("Val", 57, "10000,00", "geografia");
        p1.exibirDados();
    }
}
