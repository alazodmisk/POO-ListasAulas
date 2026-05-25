package br.com.ex12;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static void main() {

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar Aluno");
            System.out.println("2 - Listar Aluno");
            System.out.println("3 - Remover Aluno");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    System.out.println("Digite a matrícula: ");
                    String matricula = scanner.nextLine();
                    removerAluno(matricula);
                    break;
            }
        } while (opcao != 4);
    }

    public static void cadastrarAluno() {
        System.out.println("\n=== CADASTRO DE PROFESSOR ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Matricula: ");
        String materia = scanner.nextLine();

        Aluno aluno = new Aluno(nome, materia);
        alunos.add(aluno);

        System.out.println("\nProfessor cadastrado com sucesso!");
    }

    public static void listarAlunos(){
        for (Aluno i : alunos){
            i.exibirDados();
        }
    }

    public static void removerAluno(String matricula){
        alunos.removeIf(i -> Objects.equals(i.getMatricula(), matricula));
    }
}
