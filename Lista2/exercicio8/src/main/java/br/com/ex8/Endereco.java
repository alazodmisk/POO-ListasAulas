package br.com.ex8;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private int cep;
    private int numero;

    public Endereco(String rua, String bairro, String cidade, int cep, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public int getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void exibirDados(){
        System.out.println("**********");
        System.out.println("Numero: " + numero);
        System.out.println("Rua; " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("CEP: " + cep);
    }
}
