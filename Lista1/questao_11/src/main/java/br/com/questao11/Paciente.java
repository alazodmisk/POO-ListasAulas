package br.com.questao11;

public class Paciente {
    private String nome;
    private int idade;
    private double pesoKG;
    private double alturaEmMetros;
    private double imc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return pesoKG;
    }

    public void setPeso(double peso) {
        this.pesoKG = peso;
    }

    public double getAlturaEmMetros() {
        return alturaEmMetros;
    }

    public void setAlturaEmMetros(double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros;
    }


    public void calcularIMC(){
        imc = pesoKG / (alturaEmMetros*alturaEmMetros);
        System.out.printf("IMC calculado = %.2f\n", imc);
    }


    public void classificaIMC(){
        if (imc <= 22) {
            System.out.println("Peso abaixo do ideal");
        } else if (imc >= 25) {
            System.out.println("Peso acima do ideal");
        } else {
            System.out.println("Pesoa ideal");
        }
    }
}
