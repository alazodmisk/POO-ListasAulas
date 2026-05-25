package br.com.questao13;

public class Main {
    static void main() {

        Jogador jg1 = new Jogador();

        jg1.setNivel(0);
        jg1.setNome("Yoseph");
        jg1.setPontuacao(0);


        jg1.adicionarPontos(50);

        jg1.subirNivel();
    }
}
