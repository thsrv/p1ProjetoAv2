package com.company;

public class Som extends Eletronico {

    private float estacao;

    public Som(String nome,String cor, String fabricante, double altura, double largura, String numeroSerie, double preco) {
        super(nome,cor, fabricante, altura, largura, numeroSerie, preco);
        this.estacao = 90.1f;
    }

    public float getEstacao() {
        return estacao;
    }

    @Override
    public void ligar(){
        if(ligado!=true){
            ligado=true;
            System.out.println("Som "+nome+" ligado!");
        }
    }

    @Override
    public void desligar(){
        if(ligado!=false){
            ligado = false;
            System.out.println("Som "+nome+" desligado!");
        }
    }

    //Mudar estação.
    public void mudar(float estacao){
        this.estacao = estacao;
    }

}
