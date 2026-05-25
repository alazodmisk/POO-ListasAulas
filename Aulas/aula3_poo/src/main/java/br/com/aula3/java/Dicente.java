package br.com.aula3.java;

public class Dicente extends Pessoa {
    private int nota;

    public Dicente (String nome, int idade, String cpf, int nota){
        super(nome, idade, cpf);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void envelhecer(){
        this.idade = idade + 2;
    }
}
