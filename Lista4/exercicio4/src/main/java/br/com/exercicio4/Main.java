package br.com.exercicio4;
/*
O aluno só poderá pegar um livro emprestado se ele estiver ativo (disponível)
Utilizarei a classe ENUM para definir o statu do livro se ele estará disponível ou não
Apenas uma pessoa do tipo Aluna poderá pedir um livro emprestado
Apenas uma pessoa do tipo Bibliotecária poderá cadastrar um novo livro
Será utilizado o modelo MVC

Objeto do tipo BibliotecaController será criado e controlará o fluxo do código
Iteração na camada de controle que chamará a BibliotecaView e as classes de modelo quando necessário
 */

import br.com.exercicio4.controller.BibliotecaController;

public class Main {
    static void main() {

        BibliotecaController bibliotecaController = new BibliotecaController();

        bibliotecaController.iniciar();
    }
}
