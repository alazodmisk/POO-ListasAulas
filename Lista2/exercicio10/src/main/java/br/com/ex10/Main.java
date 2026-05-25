package br.com.ex10;

public class Main {
    static void main() {
        Perfil perfil = new Perfil("BIOOO", "uma foto de gato", "Publico");
        Usuario usuario = new Usuario("Usuario1342", "emial@email.com", perfil);

        usuario.exibirDados();
    }
}
