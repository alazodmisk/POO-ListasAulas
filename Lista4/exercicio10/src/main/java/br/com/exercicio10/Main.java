package br.com.exercicio10;

/*
Um usuário do tipo Admin poderá criar um usuário do tipo padrão, mas
não é possível criar usuários do tipo admin. Logo os usuários Admin
deverão ser criador por e os usuários padrão por cadastro no terminal

Uma iteração de um menu irá ter as perguntas para preencher os atributos
do Usuário. Você pode listar os usuários criados também.

Será usado ENUM contendo o tipo de usuário
*/


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuariosPadrao = new ArrayList<>();
        ArrayList<Usuario> usuariosAdmin = new ArrayList<>();

        Usuario admin = new Usuario("Admin", "1481518148", TipoUsuario.ADMIN);
        usuariosAdmin.add(admin);

        int op;
        do{
            System.out.println("***************");
            System.out.println("1- Cadastrar Usuário | 2- Listar usuários | 3- Sair");
            op = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();
                    for (Usuario u : usuariosAdmin) {
                        if (Objects.equals(u.getNome(), nome)) {
                            System.out.println("Digite o nome do novo Usuário");
                            String usuario = scanner.nextLine();
                            System.out.println("Digite o CPF do novo Usuário");
                            String cpf = scanner.nextLine();
                            usuariosPadrao.add(new Usuario(usuario, cpf, TipoUsuario.PADRAO));
                        }
                    }
                    break;

                case 2:
                    for (Usuario i : usuariosPadrao) {
                        i.exibirDados();
                    }
                    break;
            }
        }while (op != 3);
    }
}
