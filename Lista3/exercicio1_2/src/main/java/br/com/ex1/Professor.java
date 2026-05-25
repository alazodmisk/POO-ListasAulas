package br.com.ex1;

public class Professor extends Pessoa {
    private String salario;
    private String disciplina;

    public Professor(String nome, int idade, String salario, String disciplina) {
        super(nome, idade);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }


    public void exibirDados(){
        System.out.println("===========");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + salario);
        System.out.println("Disciplina" + disciplina);
    }
}
