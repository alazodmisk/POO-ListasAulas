package br.com.questao14;

public class Main {
    static void main() {

        Contato ct1 = new Contato();

        ct1.setEmail("email@eamil.com");
        ct1.setNome("Yuselp");
        ct1.setTelefone("44 99562-1321");

        ct1.exibirContato();

        ct1.atulizarTelefone("44 99876-1234");

        ct1.exibirContato();
    }
}
