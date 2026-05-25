package br.com.ex3;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String marca, String modelo, int qtdPortas) {
        super(marca, modelo);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade de Portas: " + qtdPortas);
        System.out.println("===========");
    }
}
