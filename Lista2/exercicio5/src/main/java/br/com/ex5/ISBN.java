package br.com.ex5;

public class ISBN {
    private String editora;
    private String codigo;

    public ISBN(String editora, String codigo) {
        this.editora = editora;
        this.codigo = codigo;
    }

    public String getEditora() {
        return editora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibirDados(){
        System.out.println("**********");
        System.out.println("Código: " + codigo);
        System.out.println("Editora: " + editora);
    }
}
