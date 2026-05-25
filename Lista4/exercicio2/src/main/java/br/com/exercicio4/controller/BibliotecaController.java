package br.com.exercicio4.controller;

import br.com.exercicio4.model.Livro;
import br.com.exercicio4.model.Pessoa;
import br.com.exercicio4.model.StatusLivro;
import br.com.exercicio4.model.StatusPessoa;
import br.com.exercicio4.view.BibliotecaView;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BibliotecaController {

    BibliotecaView bibliotecaView = new BibliotecaView();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Livro> livros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void iniciar(){
        int op;
        String titulo;
        String nome;
        do {
            op = bibliotecaView.operacao();

            switch (op) {
                case 1:
                    Pessoa pessoa = bibliotecaView.cadastrarPessoa();
                    pessoas.add(pessoa);
                    break;

                case 2:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    for (Pessoa j : pessoas){
                        if(Objects.equals(j.getNome(), nome) && j.getStatusPessoa()==StatusPessoa.BIBILIOTECARIO){
                            Livro livro = bibliotecaView.cadastrarLivro();
                            livros.add(livro);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    for(Pessoa j : pessoas){
                        if (Objects.equals(j.getNome(), nome) && j.getStatusPessoa()==StatusPessoa.ALUNO){
                            titulo = bibliotecaView.emprestarLivro();
                            for (Livro i : livros){
                                if(Objects.equals(i.getTitulo(), titulo)){
                                    if(i.getStatusLivro()== StatusLivro.DISPONIVEL){
                                        i.setStatusLivro(StatusLivro.INDISPONIVEL);
                                        System.out.println("Livro emprestado com Sucesso");
                                    }else{
                                        System.out.println("Livro indisponível no momento");
                                    }
                                }else{
                                    System.out.println("Livro não encontrado");
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite seu nome:");
                    nome = scanner.nextLine();
                    for(Pessoa j : pessoas){
                        if (Objects.equals(j.getNome(), nome) && j.getStatusPessoa() == StatusPessoa.ALUNO){
                            titulo = bibliotecaView.devolverLivro();
                            for (Livro i : livros){
                                if (Objects.equals(i.getTitulo(), titulo)){
                                    if(i.getStatusLivro()==StatusLivro.INDISPONIVEL){
                                        i.setStatusLivro(StatusLivro.DISPONIVEL);
                                        System.out.println("Livro devolvido com Sucesso");
                                    }else{
                                        System.out.println("Livro já foi devolvido");
                                    }
                                }else{
                                    System.out.println("Livro não encontrado");
                                }
                            }
                        }
                    }
                    break;

                case 5:
                    for (Livro i : livros){
                        i.exibirDados();
                    }
                    break;
            }
        } while(op != 6);
    }
}
