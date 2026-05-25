package br.com.ex8;

public class Casa {
    private String cor;
    private String qtdQuartos;
    private Endereco endereco;

    public Casa(String cor, String qtdQuartos, Endereco endereco) {
        this.cor = cor;
        this.qtdQuartos = qtdQuartos;
        this.endereco = endereco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(String qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void exibirDados() {
        System.out.println("**********");
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de quartos: " + qtdQuartos);
        endereco.exibirDados();
    }
}
