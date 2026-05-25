package br.com.ex17;


import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Contato> contatos = new ArrayList<>();

        ContatoPessoal ctp1 = new ContatoPessoal("6328328", "nejiw");
        ContatoPessoal ctp2 = new ContatoPessoal("4348932", "fnejinfeji");

        ContatoProfissional cpl1 = new ContatoProfissional("158159195", "dnejidei");
        ContatoProfissional cpl2 = new ContatoProfissional("258181481", "mdejwindewi");

        contatos.add(ctp1); contatos.add(ctp2); contatos.add(cpl1); contatos.add(cpl2);

        for (Contato i : contatos){
            i.exibirDados();
        }

        for (Contato i : contatos){
            if (i instanceof ContatoProfissional){
                i.exibirDados();
            }
        }
    }
}
