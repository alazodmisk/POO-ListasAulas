package br.com.ex4;

public class Gerente extends Funcionario{
    private double setor;

    public Gerente(String nome, String salario, double setor) {
        super(nome, salario);
        this.setor = setor;
    }

    public double getSetor() {
        return setor;
    }

    public void setSetor(double setor) {
        this.setor = setor;
    }

    public void exibirDados(){
        System.out.println(">>>" + getNome());
        System.out.println(">>>" + getSalario());
        System.out.println(">>>" + setor);
    }
}
