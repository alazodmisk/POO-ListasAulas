package br.com.pudim.model;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoShimano = new Endereco("rua Vicente de Mauá", "875000-00", 12);
        Pessoa jose = new Pessoa(775848, "José", 20, "89839291-90", enderecoShimano);
        Pessoa gusta = new Pessoa(748399, "Gusta", 19, "384294832", enderecoShimano);
        //Pessoa shimano = new Pessoa();
        //Pessoa munir = new Pessoa();

        jose.falar();

        System.out.println("nome: " + jose.getNome());
        System.out.println(jose.falar());
        System.out.printf("endereço: " + gusta.getEndereco());
    }
}
