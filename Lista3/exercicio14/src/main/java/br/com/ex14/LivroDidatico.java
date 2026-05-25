package br.com.ex14;

public class LivroDidatico extends Livro{
    private String materia;

    public LivroDidatico(String titulo, String autor, String materia) {
        super(titulo, autor);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void exibirDados(){
        System.out.println("*******");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Matéria: " + materia);
        System.out.println("*******");
    }
}
