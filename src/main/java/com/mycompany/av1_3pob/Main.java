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
    
    int opcao;

    Scanner ler = new Scanner(System.in);
    ArrayList <Produto>arrayProdutos = new ArrayList<>();    
    
    
    Menu menu = new Menu();
    do {
    menu.principal();
    opcao = ler.nextInt();
    switch (opcao) {
        case  1:
            menu.incluir();
            Produto produtoTemp = new Produto();
            produtoTemp.obterProduto();
            arrayProdutos.add(produtoTemp);
            System.out.println("\n*** PRODUTO INSERIDO COM SUCESSO ***\n");
            break;
        case  2:
            
            menu.alterar();
            break;  
        case  3:
            menu.excluir();
            break;  
        case  4:
            menu.listarTodos();
            for(int i=0;i<arrayProdutos.size();i++) {
                arrayProdutos.get(i).exibe();
            }
            break;  
        case  5:
            menu.listarUm();
            break;  
    }
    } while (opcao != 6);
    }
}
