package org.com.aula3.java;

public abstract class ContaBancaria {
    private int id;
    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int id, int numeroConta, String titular) {
        this.id = id;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getId() {
        return id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirTitular(){
        System.out.println("Titular: " + titular);
    }

    public abstract void sacar(double valor);

    public abstract void exibirTipoConta();
}
