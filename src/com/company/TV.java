package com.company;


public class TV extends Eletronico {

    private int canal;

    public TV(String nome,String cor, String fabricante, double altura, double largura, String numeroSerie, double preco){
        super(nome,cor, fabricante, altura, largura, numeroSerie, preco);
        this.canal = 2;//canal ja definido para incialização.
    }
    //SOBRECARGA. TV pra ser instanciada recebendo o canal.
    public TV(String nome,String cor, String fabricante, double altura, double largura, String numeroSerie, double preco, int canal){
        super(nome,cor, fabricante, altura, largura, numeroSerie, preco);
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    @Override
    public void ligar(){
        if(ligado!=true){
            ligado=true;
            System.out.println("TV "+nome+" ligada!");
        }
    }

    @Override
    public void desligar(){
        if(ligado!=false){
            ligado = false;
            System.out.println("TV "+nome+" desligada!");
        }
    }

    //Metodo para mudar o canal recebendo o canal especifico.
    public void mudarCanal(int canal){
        this.canal  = canal;
    }

    //SOBRECARGA. Muda o canal de 1 por 1.
    public void mudarCanal(){
        this.canal+=1;
    }



}
