package br.com.exercicio1;

public class Produto {
    private String nomeProduto;
    private Usuario usuarioCadastrante;
    private double preco;


    public Produto(String nomeProduto, double preco, Usuario usuarioCadastrante) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.usuarioCadastrante = usuarioCadastrante;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Usuario getUsuarioCadastrante() {
        return usuarioCadastrante;
    }

    public void exibirDados(){
        System.out.println("=========");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço: " + preco);
        usuarioCadastrante.exibirDados();
    }
}
