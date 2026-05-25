package br.com.aula5;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        Quadrado qd1 = new Quadrado(3.5);
        System.out.println("Area: " + qd1.calcularArea());

        Triangulo tg1 = new Triangulo(4, 9.8);
        System.out.println("Area: " + tg1.calcularArea());

        ArrayList<FiguraGeometrica> figuraGeometricas = new ArrayList<>();

        figuraGeometricas.add(qd1);
        figuraGeometricas.add(tg1);
        figuraGeometricas.add(new Quadrado(2.5));

        for(FiguraGeometrica fg : figuraGeometricas){
            System.out.println("Figura: " + fg.getNome());
            System.out.println("Area: " + fg.calcularArea());
            System.out.println("--");
        }
    }
}
