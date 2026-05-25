package br.com.exercicio4.view;

import br.com.exercicio4.model.Livro;
import br.com.exercicio4.model.Pessoa;
import br.com.exercicio4.model.StatusLivro;
import br.com.exercicio4.model.StatusPessoa;

import java.util.Scanner;

public class BibliotecaView {
    Scanner scanner = new Scanner(System.in);

    public int operacao(){
        System.out.println("====Biblioteca====");
        System.out.println("1- Cadastrar Pessoa | 2- Cadastrar Livro | 3- Pegar livro emprestado");
        System.out.println("4- Devolver livros | 5- Listar livros | 6- Sair");
        int operando = Integer.parseInt(scanner.nextLine());
        return operando;
    }


    public Pessoa cadastrarPessoa(){
        StatusPessoa funcao;

        System.out.println("**********");
        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Escolha: 1-Aluno | 2-Bibliotecária");
        int op = Integer.parseInt(scanner.nextLine());

        if (op==1){
            funcao = StatusPessoa.ALUNO;
        }else{
            funcao = StatusPessoa.BIBILIOTECARIO;
        }

        return new Pessoa(nome, funcao);
    }


    public Livro cadastrarLivro(){
        StatusLivro situacao;

        System.out.println("**********");
        System.out.println("Digite o titulo do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        return new Livro(titulo, autor);
    }


    public String emprestarLivro(){
        System.out.println("**********");
        System.out.println("Digite o nome do livro que deseja emprestar: ");
        return scanner.nextLine();
    }


    public String devolverLivro(){
        System.out.println("**********");
        System.out.println("Digite o nome do livro que deseja devolver: ");
        return scanner.nextLine();
    }
}
