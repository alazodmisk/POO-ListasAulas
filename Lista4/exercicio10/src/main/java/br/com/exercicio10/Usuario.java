package br.com.exercicio10;

public class Usuario {
    private String nome;
    private String cpf;
    private TipoUsuario tipoUsuario;

    public Usuario(String nome, String cpf, TipoUsuario tipoUsuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void exibirDados(){
        System.out.println("===========");
        System.out.println("Nome: " + nome + " | CPF: " + cpf);
        if (tipoUsuario == TipoUsuario.ADMIN){
            System.out.println("Usuário do tipo ADMIN");
        }else{
            System.out.println("Usuário do tipo PADRAO");
        }
    }
}
