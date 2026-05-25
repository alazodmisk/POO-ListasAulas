package br.com.ex9;

public class Main {
    static void main() {
        Cnpj cnpj = new Cnpj(89374839);
        Empresa empresa = new Empresa("Nome de Empresa", "Explorar o proletariado", cnpj);

        empresa.exibirDados();
    }
}
