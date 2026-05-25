package br.com.ex11;

public class Professor {
    private String nome;
    private String materia;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void exibirDados(){
        System.out.println("**********");
        System.out.println("Nome: " + nome);
        System.out.println("Matéria: " + materia);
    }
}
