package br.com.ex10;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("**********");
        System.out.println("Login: " + login);
        System.out.println("Email: " + email);
        perfil.exibirDados();
    }
}
