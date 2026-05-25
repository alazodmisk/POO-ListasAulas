package br.com.ex6;

public class Main {
    static void main() {

        Cracha cracha = new Cracha("10373137", "12/12/2027");
        Funcionario funcionario = new Funcionario("Gusta", "Repositor", cracha);

        funcionario.exibirDados();
    }
}
