package br.com.ex14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    static void main() {

        Livro[] arrayLivros = new Livro[3];
        ArrayList<Livro> listLivros = new ArrayList<>();

        for(Livro i : arrayLivros){
            i.exibirDados();
        }

        for(Livro i : listLivros){
            i.exibirDados();
        }
    }
}
