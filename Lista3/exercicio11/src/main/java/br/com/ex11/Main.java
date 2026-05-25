package br.com.ex11;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static List<Professor> professores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static void main() {


        int opcao;

        do {
            System.out.println("\n1 - Cadastrar professor");
            System.out.println("2 - Listar professores");
            System.out.println("3 - Procurar professor");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarProfessor();
                    break;
                case 2:
                    listarProfessores();
                    break;
                case 3:
                    System.out.println("Digite o nome do Professor: ");
                    String nome = scanner.nextLine();
                    procurarProfessor(nome);
            }
        } while (opcao != 4);
    }

    public static void cadastrarProfessor() {
        System.out.println("\n=== CADASTRO DE PROFESSOR ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Matéria: ");
        String materia = scanner.nextLine();

        Professor professor = new Professor(nome, materia);
        professores.add(professor);

        System.out.println("\nProfessor cadastrado com sucesso!");
    }

    public static void listarProfessores(){
        for (Professor i : professores){
            i.exibirDados();
        }
    }

    public static void procurarProfessor(String nome){
        for (Professor i : professores){
            if (Objects.equals(i.getNome(), nome)){
                i.exibirDados();
            }
        }
    }

    p
}
