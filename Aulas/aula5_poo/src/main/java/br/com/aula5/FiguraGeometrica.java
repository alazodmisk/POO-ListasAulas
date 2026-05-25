package br.com.aula5;

public abstract class FiguraGeometrica {
    private String nome;
    private int numLados;

    public FiguraGeometrica(String nome, int numLados) {
        this.nome = nome;
        this.numLados = numLados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract double calcularArea();
}
