package com.company;



public class Eletronico extends Produto {

    private String cor;
    private double altura;
    private double largura;
    private int volume;

    public boolean ligado = false;

    public Eletronico(String nome,String cor, String fabricante, double altura, double largura, String numeroSerie, double preco){
        this.nome = nome;
        this.cor = cor;
        this.fabricante = fabricante;
        this.altura = altura;
        this.largura = largura;
        this.numeroSerie = numeroSerie;
        this.preco = preco;
        this.volume = 0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void mostrarNumSerie(){
        System.out.println(getNumeroSerie());
    }

    @Override
    public void mostrarPreco(){
        System.out.println(String.format("%.2f",getPreco()));
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public String getNumeroSerie(){
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //metodo mostrar o tamanho
    public void tamanho(){
        System.out.println("Largura: "+largura);
        System.out.println("Altura: "+altura);
    }

    //metodo ligar
    public void ligar(){
        if(ligado!=true){
            ligado=true;
        }
    }

    //metodo desligar.
    public void desligar(){
        if(ligado!=false){
            ligado = false;
        }
    }

    //metodo aumentar volume.
    public void aumentarSom(int volume){
        this.volume += volume;
    }

    //Metodo mostrar cor.
    public void mostrarCor(){
        System.out.println(getCor());
    }

    public String toString(){
        return  nome
                +" da "
                +fabricante
                +" no valor de R$"
                +String.format("%.2f",preco);
    }









}
