package br.com.exercicio3.model;

public class Usuario {
    private String nomeUsuario;
    private TipoUsuario tipoUsuario;

    public Usuario(String nomeUsuario, TipoUsuario tipoUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }
}
