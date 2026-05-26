package br.com.exercicio3.exception;

public class ErroInesperado extends RuntimeException {
    public ErroInesperado(String message) {
        message = "Ocorreu um erro Inesperado";
        super(message);
    }
}
