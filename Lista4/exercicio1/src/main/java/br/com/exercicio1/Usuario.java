package br.com.exercicio1;

public class Usuario {
    private String nome;
    private boolean admin;

    public Usuario(String nome, boolean admin) {
        this.nome = nome;
        this.admin = admin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public void exibirDados(){
        System.out.println("=========");
        System.out.println("Nome: " + nome);
        if (isAdmin()){
            System.out.println("O usuário é um Administrador");
        }else{
            System.out.println("O usuário não é um Administrador");
        }
    }
}
