package br.com.ex16;

public class Vendedor extends Funcionario{
    private int corredor;

    public Vendedor(String nome, double salario, int corredor) {
        super(nome, salario);
        this.corredor = corredor;
    }

    public int getCorredor() {
        return corredor;
    }

    public void setCorredor(int corredor) {
        this.corredor = corredor;
    }

    @Override
    public void exibirDados() {
        System.out.println("*******");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("corredor: " + corredor);
    }
}
