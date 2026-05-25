package br.com.questao7;

public class Main {
    static void main() {

        Funcionario funcionario = new Funcionario();

        funcionario.setCargo("Auxiliar de tudo");
        funcionario.setNome("José");
        funcionario.setSalario(1500.00);

        funcionario.aumentarSalario(50.00);
        funcionario.exibirFuncionario();
    }
}
