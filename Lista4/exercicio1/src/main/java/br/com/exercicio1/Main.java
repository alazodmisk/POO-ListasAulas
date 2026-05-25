package br.com.exercicio1;
/*
Classe Main, classe Produto e classe Usuario
Na classe Produto os atributos serão: nome e preco
Na classe Usuario os atributos serão: nome e admin(booleano)
Não terá necessidade de ENUM
Qualquer usuário pode visualizar os produtos, porém apenas um Admin pode cadastrar
Para cadastrar um produto é preciso informar seu nome de usuário para a verificação de ADMIN

Menu de ações contendo: Sair, Listar produtos, Cadastrar produto
Cadastrar produto: Verifica se usuário é admin
    Se for admin permite cadastrar produto e adiciona num arraylist de produtos
    Senão o usuário é impedido de cadastrar produto
Listar produto: Iteração exibindo dados do produto com o nome de quem cadastrou
Sair: Finzaliza a execução
*/

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main() {
        int op = 2;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Usuario usuarioAdmin = new Usuario("UsuAdmin", true);
        Usuario usuarioNaoAdmin = new Usuario("UsuNaoAdmin", false);
        usuarios.add(usuarioAdmin); usuarios.add(usuarioNaoAdmin);


        do{
            System.out.println("===CADASTRO DE PRODUTOS===");
            System.out.println("Deseja: 1- Listar produtos | 2- Cadastrar Produto | 3- sair");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1:
                    for (Produto i : produtos){
                        i.exibirDados();
                    }
                    break;

                case 2:
                    System.out.println("Digite o seu nome de usuário: ");
                    String nome = scanner.nextLine();
                    for (Usuario i : usuarios){
                        if(Objects.equals(i.getNome(), nome)){
                            if (i.isAdmin()) {
                                System.out.println("Digite o nome do produto: ");
                                String produto = scanner.nextLine();
                                System.out.println("Digite o preço do produto: ");
                                double preco = Double.parseDouble(scanner.nextLine());
                                produtos.add(new Produto(produto, preco, i));
                                System.out.println("Produto criado com sucesso");
                            }else{
                                System.out.println("Usuário não é administrador");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;
            }
        }while(op != 3);
    }
}
