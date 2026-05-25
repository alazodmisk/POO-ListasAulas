package br.com.questao15;

public class Main {
    static void main() {

        LivroBiblioteca l1 = new LivroBiblioteca();
        LivroBiblioteca l2 = new LivroBiblioteca();
        LivroBiblioteca l3 = new LivroBiblioteca();

        l1.setAutor("Machado de Assis");
        l1.setTitulo("Dom Casmurro");
        l1.setCodigo("ABC1234BA");
        l1.setDisponivel(true);

        l2.setTitulo("Crime castigo");
        l2.setAutor("Dostoiévsk");
        l2.setCodigo("ADU0987BV");
        l2.setDisponivel(false);

        l3.setTitulo("Paz e guerra");
        l3.setAutor("Liev tolstói");
        l3.setCodigo("QWE1578MK");
        l3.setDisponivel(true);

        l1.exibirInformacoes();
        l2.exibirInformacoes();
        l3.exibirInformacoes();

        l1.emprestar();
        l2.emprestar();
        l3.emprestar();

        l1.devolver();
        l2.devolver();
        l3.devolver();

        l1.devolver();
        l2.emprestar();
    }
}
