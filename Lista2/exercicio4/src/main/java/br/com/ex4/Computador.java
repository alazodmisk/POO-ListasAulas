package br.com.ex4;

public class Computador{
    private String processador;
    private String marca;
    private PlacaMae placaMae;

    public Computador(String processador, String marca, PlacaMae placaMae) {
        this.processador = processador;
        this.marca = marca;
        if (placaMae.isUsado() == false) {
            this.placaMae = placaMae;
            placaMae.setUsado(true);
        } else {
            System.out.println("Placa mãe usada");
            this.placaMae = null;
        }
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }


    public void exibirDados(){
        System.out.println("===========");
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        placaMae.exibirDados();
    }
}
