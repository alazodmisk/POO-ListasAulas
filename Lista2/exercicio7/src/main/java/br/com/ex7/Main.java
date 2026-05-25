package br.com.ex7;

public class Main {
    static void main() {
        Prontuario pt1 = new Prontuario("283y278", "-o", "Pneu");
        Paciente pc1 = new Paciente("Robosn", 18, pt1);
        //Sim, tenho um amigo chamado robson com alergia de pneu

        pc1.exibirDados();

    }
}
