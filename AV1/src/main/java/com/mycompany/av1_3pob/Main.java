/*
    PROVA AV1 3POB
    NOME: THIAGO SANTOS POLICARPO
    MATRÍCULA: 2120478300011
    EMAIL: THIAGO.2120478300011@FAETERJ-RIO.EDU.BR
*/
package com.mycompany.av1_3pob;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
    
    int opcao, opcaoII;
    Produto produtoTemp;

    Scanner ler = new Scanner(System.in);
    ArrayList <Produto>arrayProdutos = new ArrayList<>();   
    
    Produto shampoo = new Produto("110110","6878","Shampoo","Produto de lavar cabelo masculino","Higiene",15.99,49.0,"Pantene");
    Produto cd = new Produto("010010","9211","CD","CD da banda Calypso","Entreterimento",39.99,10.0,"Furacão 200");
    Produto arma = new Produto("111001","1470","Arma","Arma de fogo calibre 38","Esportes",700,150.0,"Gun Pro");
    arrayProdutos.add(shampoo);
    arrayProdutos.add(cd);
    arrayProdutos.add(arma);
    
    Menu menu = new Menu();
    do {
    menu.principal();
    opcao = ler.nextInt();
    switch (opcao) {
        case  1:
            menu.incluir();
            produtoTemp = new Produto("","","","","",0,0,"");
            produtoTemp.obterProduto();
            arrayProdutos.add(produtoTemp);
            System.out.println("\n*** PRODUTO INSERIDO COM SUCESSO ***\n");
            break;
        case  2:
            menu.alterar();
            for(int i=0;i<arrayProdutos.size();i++) {
                System.out.printf("(%d) ",i);
                arrayProdutos.get(i).exibeApenasNome();
            }
            System.out.printf("Selecione um produto: ");
            opcaoII = ler.nextInt();
            produtoTemp = new Produto("","","","","",0,0,"");
            produtoTemp.obterProduto();
            arrayProdutos.remove(opcaoII);
            arrayProdutos.add(opcaoII,produtoTemp);
            System.out.printf("\n*** PRODUTO ALTERADO COM SUCESSO ***\n\n");
            
            break;  
        case  3:
            menu.excluir();
            for(int i=0;i<arrayProdutos.size();i++) {
                System.out.printf("(%d) ",i);
                arrayProdutos.get(i).exibeApenasNome();
            }
            System.out.printf("Selecione um produto: ");
            opcaoII = ler.nextInt();
            arrayProdutos.remove(opcaoII);
            System.out.printf("\n*** PRODUTO EXCLUIDO COM SUCESSO ***\n\n");
            break;  
        case  4:
            menu.listarTodos();
            for(int i=0;i<arrayProdutos.size();i++) {
                arrayProdutos.get(i).exibe();
            }
            break;  
        case  5:
            menu.listarUm();
            for(int i=0;i<arrayProdutos.size();i++) {
                System.out.printf("(%d) ",i);
                arrayProdutos.get(i).exibeApenasNome();
            }
            System.out.printf("Selecione um produto: ");
            opcaoII = ler.nextInt();
            arrayProdutos.get(opcaoII).exibe();
            break;  
    }
    } while (opcao != 6);
    }
}
