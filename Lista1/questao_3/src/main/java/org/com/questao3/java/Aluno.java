package org.com.questao3.java;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calculaMedia(){
        media = (nota1 + nota2) / 2;
        System.out.println("Media: " + media);
    }

    public void verificarSituacao() {
        if (media >= 7.0){
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
    }
}
