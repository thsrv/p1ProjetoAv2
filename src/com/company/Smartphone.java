package com.company;

public class Smartphone extends Eletronico {

    private int numeroDestino;

    public Smartphone(String nome,String cor, String fabricante, double largura, double altura, String numeroSerie, double preco){
        super(nome,cor,fabricante,largura,altura,numeroSerie,preco);
        this.numeroDestino = 0;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        this.numeroDestino = numeroDestino;
    }


    public void ligar(int numeroDestino){
        System.out.println("Reliazando chamada para o numero: "+getNumeroDestino());
    }
}
