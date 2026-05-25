package br.com.aula6;

public class Canarinho extends Animal implements Voador{

    public Canarinho(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando");
    }
}
