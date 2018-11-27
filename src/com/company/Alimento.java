package com.company;

public class Alimento extends Produto {


    //public String tipo;
    public double peso;

    public Alimento(String nome,/*String tipo,*/ double peso, String numeroSerie, String fabricante, double preco){
        this.nome = nome;
       // this.tipo = tipo;
        this.peso = peso;
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   /* public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
*/
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNumeroSerie(){
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public void mostrarNumSerie(){
        System.out.println(getNumeroSerie());
    }

    @Override
    public void mostrarPreco(){
        System.out.println(String.format("%.2f",getPreco()));
    }

    public void mostrarPeso(){
        System.out.println(peso+"Kg");
    }

    public void tipoProduto(){
        System.out.println("É "+nome);
    }

    public String toString(){
        return  nome
                +" da "
                +fabricante
                +" no valor de R$"
                +String.format("%.2f",preco);
    }



}
