package br.com.ex1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Cpf cpf1 = new Cpf("123.123.123.12", "regular");
        Pessoa p1 = new Pessoa("José", cpf1);

        p1.exibirDados();
    }
}
