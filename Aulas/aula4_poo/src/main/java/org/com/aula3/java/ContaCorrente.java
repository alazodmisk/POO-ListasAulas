package org.com.aula3.java;

public class ContaCorrente extends ContaBancaria{

    private double limiteConta;
    public ContaCorrente(int id, int numeroConta, String titular, double limiteConta) {
        super(id, numeroConta, titular);
        this.limiteConta = limiteConta;
    }

    @Override
    public void exibirTitular() {
        System.out.println("Titular: " + getTitular());
    }

    @Override
    public void sacar(double valor) {
        if(getSaldo()+limiteConta >= valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque concluído com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void exibirTipoConta() {
        System.out.println("Conta Corrente");
    }
}
