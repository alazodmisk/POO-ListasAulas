package br.com.ex17;

public class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String numero, String empresa) {
        super(numero);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void exibirDados() {
        System.out.println("*******");
        System.out.println("Empresa: " + empresa);
        System.out.println("Numero: " + getNumero());

    }
}
