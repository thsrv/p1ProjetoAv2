package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array de produtos para comprar. 18 ITENS
        Produto[] produtoList = {new TV("TV LED 32' HD", "cinza", "Panasonic", 1.15, 0.32, "10ATV11", 850),
                new TV("Smart TV 49' ultra HD 4K", "prata", "Samsung", 1.25, 0.49, "08ATV13", 2099),
                new Som("Mini System 1000W Rms", "preto", "LG", 81.5, 33, "07BSOM14", 1299),
                new Som("Mini System Sony Extra Bass", "preto", "Sony", 31.5, 20, "06BSOM15", 629),
                new Smartphone("Galaxy S8 Plus", "dourado", "Samsung", 0.158, 0.154, "05CPH16", 2699),
                new Smartphone("Moto G5s Plus", "grafite", "Motorola", 0.158, 0.154, "04CPH17", 999),
                new Alimento("Feijão Preto", 1, "ALI001", "Kicaldo", 4.11),
                new Alimento("Feijão Macassar", 1, "ALI001", "Turqueza", 5.50),
                new Alimento("Arroz Arbóreo", 1, "ALI002", "Emoções", 2.50),
                new Alimento("Arroz Integral", 1, "ALI002", "Namorado", 3.50),
                new Alimento("Carne Suina", 2, "ALI003", "Frimesa", 34.50),
                new Alimento("Carne Bovina", 2, "ALI003", "FriBoi", 23.50),
                new Higiene("Creme Dental total 12", 30, "HIG001", "Colgate", 3.39),
                new Higiene("Creme Dental White Now", 25, "HIG001", "CloseUp", 3.99),
                new Higiene("Shampoo Anticaspa Masculino", 300, "HIG002", "Natura", 12.70),
                new Higiene("Shampoo Cachos Poderosos Feminino", 500, "HIG002", "Garnier", 21.25),
                new Higiene("Sabonete Liquido Ultracremoso", 300, "HIG003", "Natura", 14.40),
                new Higiene("Sabonete Wash Cream", 250, "HIG003", "Dove", 11.90)};

        //Carrinho de compras VAZIO.
        CarrinhoCompras carrinho = new CarrinhoCompras();
        topo();
        int respMenu;
        int opcao=10;
        char respUs=0;

        do {
            barra();
            menu();

            respMenu = sc.nextInt();
            sc.nextLine();//pedente.

            switch (respMenu) {
                case 1://comprar itens.

                    System.out.println("Deseja comprar eletronicos(E), itens de higiene(H) ou alimentos(A) ?");
                    respUs = sc.next().charAt(0);
                    sc.nextLine();
                    if (respUs == 'E' || respUs == 'e') {
                        do {//Itens eletronicos
                            System.out.println("Escolha um eletronico: ");
                            for (int i = 0; i <= 5; i++) {
                                //pra quando um eletronico ser escolhido, sair da lista.
                                if (produtoList[i] == produtoList [opcao-1]){
                                    continue;
                                }else {
                                    System.out.println("(" + (i + 1) + ") " + produtoList[i]);
                                }
                                //System.out.println("(" + (i + 1) + ") " + produtoList[i]);
                            }
                            opcao = sc.nextInt();
                            sc.nextLine();//pedente
                            carrinho.addItem(produtoList[opcao - 1]);
                            space();
                            System.out.println("Deseja comprar mais eletronico? (S/N)");
                            respUs = sc.next().charAt(0);
                            sc.nextLine();
                        } while (respUs == 's' || respUs == 'S');
                    } else if (respUs == 'h' || respUs == 'H') {
                        do {//material de higiene.
                            System.out.println("Escolha um material de Higiene:");
                            for (int i = 12; i <= 17; i++) {
                                System.out.println("(" + (i - 11) + ") " + produtoList[i]);
                            }
                            opcao = sc.nextInt();
                            sc.nextLine();//pedente
                            carrinho.addItem(produtoList[opcao + 11]);
                            space();
                            System.out.println("Deseja comprar mais material de higiene? (S/N)");
                            respUs = sc.next().charAt(0);
                            sc.nextLine();
                        } while (respUs == 's' || respUs == 'S');
                    } else if (respUs == 'a' || respUs == 'A') {
                        do {//Alimentos.
                            System.out.println("Escolha os Alimentos: ");
                            for (int i = 6; i <= 11; i++) {
                                System.out.println("(" + (i - 5) + ") " + produtoList[i]);
                            }
                            opcao = sc.nextInt();
                            sc.nextLine();//pedente
                            carrinho.addItem(produtoList[opcao + 5]);
                            space();
                            System.out.println("Deseja comprar mais Alimentos? (S/N)");
                            respUs = sc.next().charAt(0);
                            sc.nextLine();
                        } while (respUs == 's' || respUs == 'S');
                    }
                    break;
                case 2://mostrar itens do carrinho
                    if (carrinho.itensCarrinho.size() != 0) {
                        carrinho.showItens();
                        space();
                    } else {
                        System.out.println("Seu carrinho está vazio!");
                        space();
                    }
                    break;
                case 3://mostrar o total.
                    if (carrinho.itensCarrinho.size() != 0) {
                        System.out.println("Total de R$" + String.format("%.2f", carrinho.getTotal()));
                        space();
                    } else {
                        System.out.println("Seu carrinho está vazio!");
                        space();
                    }
                    break;
                case 4://finalizar compra.
                    if (carrinho.itensCarrinho.size() != 0) {
                        System.out.println("Resumo da sua compra:");
                        carrinho.resumo();
                        space();
                        System.out.println("Valor total da sua compra foi de R$" + String.format("%.2f", carrinho.getTotal()));
                    } else {
                        System.out.println("Você não comprou nada, seu carrinho está vazio!");
                        space();
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
                    space();
                    break;
            }
            if (respMenu < 4) {//Voltar ao menu.
                System.out.println("Deseja voltar ao menu principal? (S/N)");
                respUs = sc.next().charAt(0);
                sc.nextLine();
            }else if(carrinho.itensCarrinho.size() == 0){
                respUs = 's';
            }else if (respMenu == 4 && carrinho.itensCarrinho.size()>0){
                respUs = 'n';
            }


        } while (respUs == 's' || respUs == 'S' || respMenu >= 5);
            space();//FIM
            System.out.println("Obrigado, volte sempre!");
            sc.close();
    }
    private static void topo(){
        System.out.println("<><><><><><> APSMart <><><><><><>");
        System.out.println(String.format("%26s","Carrinho de Compras"));
    }
    private static void menu(){
        System.out.println(String.format("%25s","Escolha uma opção"));
        System.out.println("(1) - Comprar item.");
        System.out.println("(2) - Ver item no carrinho.");
        System.out.println("(3) - Ver total da compra.");
        System.out.println("(4) - Finalizar compra.");

    }
    private static void space(){
        System.out.println();
    }
    private static void barra(){
        System.out.println("<><><><><><><><><><><><><><><><><>");
    }
}
