package br.com.questao12;

public class ReservaHotel {
    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorDiarias;
    private double valorTotal;

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public double getValorDiarias() {
        return valorDiarias;
    }

    public void setValorDiarias(double valorDiarias) {
        this.valorDiarias = valorDiarias;
    }


    public void calcularTotalHospedagem(){
        valorTotal = quantidadeDiarias * valorDiarias;
        System.out.println("O valor total é: " + valorTotal);
    }

    public void exibirReserva(){
        System.out.println("Reserva feita no nome de: " + nomeHospede);
        System.out.println("Total de diárias: " + quantidadeDiarias);
        System.out.println("Valor final: " + valorTotal + " // Valor por diária: " + valorDiarias);
    }
}
