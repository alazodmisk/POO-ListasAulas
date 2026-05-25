package br.com.questao13;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public void adicionarPontos(int valor){
        pontuacao += valor;
        System.out.println("Pontuação atual: " + pontuacao);
    }


    public void subirNivel(){
            nivel++;
            System.out.println("Nivel: " + nivel);

    }
}
