package com.company;

public abstract class Produto {

    public String nome;
    public String fabricante;
    public String numeroSerie;
    public double preco;

    //Assinaturas dos metodos.
    public abstract void mostrarNumSerie();
    public abstract void mostrarPreco();

    public abstract String getNome();
    public abstract void setNome(String nome);
    public abstract String getFabricante();
    public abstract void setFabricante(String fabricante);
    public abstract String getNumeroSerie();
    public abstract void setNumeroSerie(String numeroSerie);
    public abstract double getPreco();
    public abstract void setPreco(double preco);

    public abstract String toString();



}
