package br.com.exercicio9;

public class Solicitacao {
    private String titulo;
    private String descricao;
    private Usuario usuario;
    private StatusSolicitacao statusSolicitacao;

    public Solicitacao(String titulo, String descricao, Usuario usuario) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.usuario = usuario;
        this.statusSolicitacao = StatusSolicitacao.PENDENTE;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacao statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }

    public void exibirDados(){
        System.out.println("===============");
        System.out.println("Titulo: " + titulo);
        System.out.println("Descricao: " + descricao);
        if(statusSolicitacao==StatusSolicitacao.ACEITA){
            System.out.println("Soliciatação Aceita");
        }else if(statusSolicitacao==StatusSolicitacao.PENDENTE) {
            System.out.println("Solicitação Pendente");
        }else{
            System.out.println("Solicitação Recusada");
        }
        System.out.println(usuario.getNome());
    }
}
