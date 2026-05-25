package br.com.ordenacao.poo;

import java.util.Arrays;

public class Vetor {
    private int[] vetor;


    public Vetor(int[] vetor) {
        this.vetor = vetor;
    }


    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }


    public void exibir(){
        System.out.println(Arrays.toString(vetor));
    }
}
