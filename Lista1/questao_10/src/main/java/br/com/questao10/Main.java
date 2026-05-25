package br.com.questao10;

public class Main {
    static void main() {

        Filme f1 = new Filme();

        f1.setAvaliacao(7);
        f1.setDuracao(120);
        f1.setGenero("ação");
        f1.setTitulo("José, o filme");


        f1.exibeFichaTecnica();


        f1.avaliar(11);
        f1.avaliar(-3);
        f1.avaliar(8);


        f1.exibeFichaTecnica();
    }
}
