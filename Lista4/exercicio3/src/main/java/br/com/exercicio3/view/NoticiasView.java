package br.com.exercicio3.view;

import br.com.exercicio3.model.Noticia;
import br.com.exercicio3.model.TipoUsuario;
import br.com.exercicio3.model.Usuario;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class NoticiasView {
    Scanner scanner = new Scanner(System.in);


    public int menu(){
        System.out.println("=============");
        System.out.println("1- Listar notícias | 2- Cadastrar Noticia |3- Sair");
        return Integer.parseInt(scanner.nextLine());
    }


    public Noticia cadastraNoticia(){
        System.out.println("=============");
        System.out.println("Cadastre a manchete da notícia: ");
        String manchete = scanner.nextLine();
        System.out.println("Cadastre a descricao da manchete: ");
        String descricao = scanner.nextLine();
        return new Noticia(manchete, descricao);
    }


    public void listaNoticia(ArrayList<Noticia> noticias){
        for(Noticia n : noticias){
            System.out.println(n);
        }
    }


    public boolean verificaAdmin(ArrayList<Usuario> usuarios){
        System.out.println("Digite seu nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        for(Usuario u : usuarios){
            if(Objects.equals(u.getNomeUsuario(), nomeUsuario) && u.getTipoUsuario()== TipoUsuario.ADMIN){
                return true;
            }
        }
        return false;
    }
}
