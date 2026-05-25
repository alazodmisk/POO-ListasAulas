package br.com.ex17;

public class ContatoPessoal extends Contato{
    private String nome;

    public ContatoPessoal(String numero, String nome) {
        super(numero);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDados(){
        System.out.println("*******");
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + getNumero());
    }
}
