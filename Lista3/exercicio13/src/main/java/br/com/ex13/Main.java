package br.com.ex13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {

        Scanner scanner = null;
        Array lista1;
        ArrayList<Pessoa> lista2 = new ArrayList<>();
        int op;
        
        do{
            System.out.println("MENU=================");
            System.out.println("1- Cadastrar Array || 2- Cadastrar Arraylist");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
                    //Não terminei
            }

        }while (op != 3);
    }
}
