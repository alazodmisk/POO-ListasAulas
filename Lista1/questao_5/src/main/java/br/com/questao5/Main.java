package br.com.questao5;

public class Main {
    static void main() {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumero(123456789);
        conta.setSaldo(1250.00);
        conta.setTitular("José");

        System.out.println(conta.consultarSaldo());
        conta.depositar(50.00);
        conta.sacar(50.00);
        conta.sacar(2000.00);
    }
}
