package br.com.questao11;

public class Main {
    static void main() {

        Paciente pc1 = new Paciente();

        pc1.setIdade(18);
        pc1.setNome("Joseph");
        pc1.setPeso(70.2);
        pc1.setAlturaEmMetros(1.82);

        pc1.calcularIMC();

        pc1.classificaIMC();

    }
}
