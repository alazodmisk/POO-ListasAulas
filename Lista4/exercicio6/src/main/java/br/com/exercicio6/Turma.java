package br.com.exercicio6;

public class Turma {
    private String materia;
    private String turma;
    private Professor professor;

    public Turma(String materia, String turma, Professor professor) {
        this.materia = materia;
        this.turma = turma;
        this.professor = professor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }
}
