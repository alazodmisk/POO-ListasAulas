package br.com.exercicio9;

/*
Existem dois tipos de Usuários: Admins e Padrão, além de um sistema de solicitações.
Qualquer usuário pode criar uma solicitação, mas apenas admins podem aceitar solicitações
Teremos uma classe Usuário, ENUM com constantes do tipo de usuários e uma classe com solicitações
Você poderá exibir os dados da solicitação e aparecerá o nome do usuário que a criou
Haverá um ENUM com o status da solicitação (Pendente, Aceita, Recusada)
*/


import java.beans.XMLEncoder;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main() {

        ArrayList<Solicitacao> solicitacoes = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Usuario admin = new Usuario("Admin", TipoUsuario.ADMIN);
        Usuario padrao = new Usuario("Padrao", TipoUsuario.PADRAO);
        usuarios.add(admin); usuarios.add(padrao);


        int op;
        do {
            System.out.println("===Menu de Ações===");
            System.out.println("1- Criar solicitação | 2- Modificar status de solicitação | 3- Listar solicitações | 4- sair");
            op = Integer.parseInt(scanner.nextLine());

            switch (op){
                case 1:
                    System.out.println("Digite seu nome de Usuário: ");
                    String nome = scanner.nextLine();
                    for(Usuario i : usuarios){
                        if(Objects.equals(i.getNome(), nome)){
                            System.out.println("Escreva o titulo da sua solicitação: ");
                            String titulo = scanner.nextLine();
                            System.out.println("Descreve sua solicitação: ");
                            String solicitacao = scanner.nextLine();
                            solicitacoes.add(new Solicitacao(titulo, solicitacao, i));
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Digite seu nome de Usuário: ");
                    String nomeAdmin = scanner.nextLine();
                    for(Usuario u : usuarios){
                        if(Objects.equals(u.getNome(), nomeAdmin) && u.getTipoUsuario() == TipoUsuario.ADMIN){
                            Usuario usuarioLogado = u;
                            break;
                        }
                    }
                    for (Solicitacao s : solicitacoes) {
                        System.out.println(" - ");
                        s.exibirDados();
                    }
                    System.out.println("Escolha o índice da solicitação:");
                    int indice = Integer.parseInt(scanner.nextLine());
                    if (indice < 0 || indice >= solicitacoes.size()) {
                        System.out.println("Índice inválido!");
                        break;
                    }
                    System.out.println("1- Aceitar | 2- Recusar");
                    int status = Integer.parseInt(scanner.nextLine());
                    if (status == 1) {
                        solicitacoes.get(indice).setStatusSolicitacao(StatusSolicitacao.ACEITA);
                        System.out.println("Solicitação aceita!");
                    } else if (status == 2) {
                        solicitacoes.get(indice).setStatusSolicitacao(StatusSolicitacao.RECUSADA);
                        System.out.println("Solicitação recusada!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 3:
                    for(Solicitacao s : solicitacoes){
                        s.exibirDados();
                    }
                    break;

            }
        } while (op != 4);
    }
}
