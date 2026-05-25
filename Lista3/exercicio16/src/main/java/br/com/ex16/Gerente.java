package br.com.ex16;

public class Gerente extends Funcionario{
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    @Override
    public void exibirDados(){
        System.out.println("*******");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("setor: " + setor);
    }
}
