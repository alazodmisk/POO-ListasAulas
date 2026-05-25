package br.com.exercicio6;
/*
O sistema deve permitir que o professor lance nota apenas numa turma que ele seja professor
Ou seja, todas as turmas terão um atributo do tipo professor
Quando um professor for lançar a nota deverá acessar a turma pelo nome
Se a turma for associada ao professor então ele pode alterar a nota
 */


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Professor p1 = new Professor("Gilberto", "48990493232");
        Professor p2 = new Professor("Adalmir", "74839249823");
        ArrayList<Professor> professores = new ArrayList<>();
        professores.add(p1); professores.add(p2);

        Turma t1 = new Turma("Arq1", "A", p1);
        Turma t2 = new Turma("Arq1", "B", p2);
        Turma t3 = new Turma("POO", "C", p1);
        ArrayList<Turma> turmas = new ArrayList<>();
        turmas.add(t1); turmas.add(t2); turmas.add(t3);

        int op;

        System.out.println("================");
        System.out.println("1- Iniciar | 2- Sair");
        op = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            boolean naoProfessor = professores.stream()
                    .noneMatch(p -> p.getNome().equals(nome));
            if(naoProfessor){
                System.out.println("Não há professor com esse nome");
            }else{
                System.out.println("Digite o nome da materia: ");
                String materia = scanner.nextLine();
                System.out.println("Digitr a letra da turma ");
                String turma = scanner.nextLine();

                boolean naoTurma = turmas.stream()
                        .noneMatch(p -> p.getTurma().equals(turma)
                                && p.getMateria().equals(materia));
                if(naoTurma){
                    System.out.println("turma não existe");
                }else{
                    for(Turma i : turmas){
                        if(Objects.equals(i.getMateria(), materia)
                                && Objects.equals(i.getTurma(), turma)){
                            if(Objects.equals(i.getProfessor().getNome(), nome)){
                                System.out.println("Acesso para mudar nota");
                            }else{
                                System.out.println("Acesso negado");
                            }
                        }
                    }
                }
            }
            System.out.println("================");
            System.out.println("1- Iniciar | 2- Sair");
            op = Integer.parseInt(scanner.nextLine());
        } while(op != 2);
    }
}
