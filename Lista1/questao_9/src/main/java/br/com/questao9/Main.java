package br.com.questao9;

public class Main {
    static void main() {

        Celular celular = new Celular();

        celular.setMarca("Motorola");
        celular.setModelo("G52");
        celular.setNivelBateria(50);

        celular.carregar(50);
        celular.usar(10);
        celular.carregar(100);
        celular.usar(200);
    }
}
