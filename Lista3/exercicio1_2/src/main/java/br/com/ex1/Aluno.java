package br.com.ex1;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    public void exibirDados(){
        System.out.println("===========");
        System.out.println("nome: " + getNome());
        System.out.println("idade: " + getIdade());
        System.out.println("matricula: " + matricula);
        System.out.println("curso: " + curso);
    }
}
