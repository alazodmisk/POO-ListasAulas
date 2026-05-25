package br.com.aula6;

public class Cachorro extends Animal implements Terrestre{

    public Cachorro(String nome) {
        super(nome);
    }


    @Override
    public void emitirSom() {
        System.out.println(getNome() + " latir");
    }


    @Override
    public void andar() {
        System.out.println("cachorro" + getNome() + "andou");
    }
}
