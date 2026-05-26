package br.com.exercicio3.model;

public class Noticia {
    private String machete;
    private String descricao;

    public Noticia(String machete, String descricao) {
        this.machete = machete;
        this.descricao = descricao;
    }

    public String getMachete() {
        return machete;
    }

    public void setMachete(String machete) {
        this.machete = machete;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "machete='" + machete + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
