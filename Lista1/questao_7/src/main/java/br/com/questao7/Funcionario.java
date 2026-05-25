package br.com.questao7;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual){
        percentual = percentual / 100;
        double aumento = salario * percentual;
        salario = salario + aumento;
        System.out.println("Salario atual: " + salario);
    }

    public void exibirFuncionario(){
        System.out.println("Funcionario: " + nome + " / Cargo: " + cargo + " / Salario: " + salario);
    }
}
