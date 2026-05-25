package br.com.questao12;

public class Main {
    static void main() {

        ReservaHotel rh1 = new ReservaHotel();

        rh1.setNomeHospede("Josep");
        rh1.setValorDiarias(499.99);
        rh1.setQuantidadeDiarias(5);

        rh1.calcularTotalHospedagem();
        rh1.exibirReserva();
    }
}
