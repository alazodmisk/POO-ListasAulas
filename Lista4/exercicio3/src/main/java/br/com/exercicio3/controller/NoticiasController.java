package br.com.exercicio3.controller;

import br.com.exercicio3.exception.ErroInesperado;
import br.com.exercicio3.model.Noticia;
import br.com.exercicio3.model.Usuario;
import br.com.exercicio3.view.NoticiasView;

import java.util.ArrayList;

public class NoticiasController {
    NoticiasView noticiasView = new NoticiasView();
    ArrayList<Noticia> noticias = new ArrayList<>();


    public void noticias(ArrayList<Usuario> usuarios){
        int op;

        try {
            do {
                op = noticiasView.menu();
                switch (op){
                    case 1:
                        noticiasView.listaNoticia(noticias);
                        break;
                    case 2:
                        if(noticiasView.verificaAdmin(usuarios)){
                            noticias.add(noticiasView.cadastraNoticia());
                        }else{
                            System.out.println("Não possui autorização para cadastrar notícias!");
                        }
                        break;
                }
            } while (op != 3);
        } catch (ErroInesperado e){
            System.out.println(e.getMessage());
        }
    }
}
