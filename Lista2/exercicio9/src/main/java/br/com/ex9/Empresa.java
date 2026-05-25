package br.com.ex9;

public class Empresa {
    private String nomeFantasia;
    private String razaoSocial;
    private Cnpj cnpj;

    public Empresa(String nomeFantasia, String razaoSocial, Cnpj cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Cnpj getCnpj() {
        return cnpj;
    }

    public void exibirDados(){
        System.out.println("**********");
        System.out.println("Nome: " + nomeFantasia);
        System.out.println("Razão Social: " + razaoSocial);
        cnpj.exibirDados();
    }
}
