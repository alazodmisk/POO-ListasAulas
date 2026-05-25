package br.com.ex7;

public class Prontuario {
    private String numeroRegistro;
    private String tipoSanguineo;
    private String alergias;

    public Prontuario(String numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public void exibirDados() {
        System.out.println("**********");
        System.out.println("Numero do Registro: " + numeroRegistro);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
        System.out.println("Alergias: " + alergias);
    }
}
