package br.com.ex4;

public class PlacaMae {
    private String modelo;
    private String chipset;
    private boolean usado;


    public PlacaMae(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
        this.usado = false;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }


    public void exibirDados(){
        System.out.println("===========");
        System.out.println("Chipset: " + chipset);
        System.out.println("Modelo: " + modelo);
        System.out.println("===========");
    }
}
