package br.com.questao10;

public class Filme {
    private String titulo;
    private String genero;
    private int duracao;
    private double avaliacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("Avaliação atual: " + avaliacao);
        System.out.println("*---*");
    }

    public void avaliar(double novaAvaliacao){
        if (novaAvaliacao > 10 || novaAvaliacao < 0){
            System.out.println("Valor inválido");
        } else {
            this.avaliacao = novaAvaliacao;
            System.out.println("Avaliação atualizada para: " + avaliacao);
        }
    }
}
