package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {




    //lista de produtos.
    List<Produto> itensCarrinho = new ArrayList<>();


    //Metodo para ADCIONAR item.
    public void addItem(Produto item){
            if (itensCarrinho.size()>10){//quando carrinho estiver com 10 itens ele avisa.
                System.out.println("Carrinho está cheio, finalize sua compra!");
            }else {
                itensCarrinho.add(item);
                System.out.println("Item adcionado no carrinho de compras!");
            }

    }
    //calcular o valor total.
    public double getTotal(){
        double total = 0;
        //ForEach pecorrendo a lista itensCarrinho.
        for (Produto x :
                itensCarrinho) {
            total += x.getPreco();
        }
        return total;
    }
    //Mostrar os itens do carrinho.
    public void showItens(){
        System.out.println("Itens do seu carrinho:");
        for(Produto x :
                itensCarrinho){
            System.out.println("º "+x.nome+" "+x.fabricante+", preço: R$"+String.format("%.2f",x.preco));
        }
    }

    //Mostrar o resumo da compra no final.
    public void resumo(){
        for(Produto x :
                itensCarrinho){
            System.out.println("º "+x.nome+" "+x.fabricante+", no valor de R$"+String.format("%.2f",x.preco));
        }
    }

}
