package br.com.ex9;

import javax.xml.transform.Source;

public class Cnpj {
    private int numero;
    private boolean situacaoCadastral;

    public Cnpj(int numero) {
        this.numero = numero;
        this.situacaoCadastral = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSituacaoCadastral(boolean situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public void exibirDados() {
        System.out.println("**********");
        System.out.println("Numero: " + numero);
        if(isSituacaoCadastral()){
            System.out.println("CNPJ em uso [cadastrado]");
        }else{
            System.out.println("CNPJ inutilizado");
        }
    }
}
