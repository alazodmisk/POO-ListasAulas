package br.com.exercicio3;

/*
Apenas alguém com a tag VISITANTE e ADMIN pode visualizar uma noticia
porém só um admin pode CADASTRAR uma noticia
A classe ENUM define as constantes do tipo de usuário
uma classe exception faz o tratamento de erro para um erro genérico
Foi utilizado o modelo VMC para este código
*/

import br.com.exercicio3.controller.NoticiasController;
import br.com.exercicio3.model.TipoUsuario;
import br.com.exercicio3.model.Usuario;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        NoticiasController noticiasController = new NoticiasController();

        Usuario admin = new Usuario("Admin", TipoUsuario.ADMIN);
        Usuario visitante = new Usuario("Visitante", TipoUsuario.VISITANTE);
        usuarios.add(admin); usuarios.add(visitante);

        noticiasController.noticias(usuarios);
    }
}
