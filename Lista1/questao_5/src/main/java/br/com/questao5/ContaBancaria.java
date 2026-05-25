package br.com.questao5;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Impossível efetuar o saque. Saldo insuficiente");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque efetuado com sucesso no valor de: " + valor);
        }
    }
}
