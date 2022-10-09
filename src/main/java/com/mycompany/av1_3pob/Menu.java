package com.mycompany.av1_3pob;

public class Menu {
    public void principal(){
        System.out.println("Escolha uma opção:");
        System.out.println("(1) - Incluir produto");
        System.out.println("(2) - Alterar produto");
        System.out.println("(3) - Excluir produto");
        System.out.println("(4) - Listar todos produtos");
        System.out.println("(5) - Listar um produto");
        System.out.println("(6) - Sair");
        System.out.printf("Opção: ");
    }
    
    public void incluir() {
        System.out.println("\nINCLUINDO PRODUTOS:");
    }
    
    public void alterar() {
        System.out.println("\nALTERANDO PRODUTOS:");
        System.out.println("Selecione um produto\n");
    }
    
    public void excluir() {
        System.out.println("\nEXCLUINDO PRODUTOS:");
    }
    
    public void listarTodos() {
        System.out.printf("\nLISTANDO TODOS OS PRODUTOS:");
    }
    
    public void listarUm() {
        System.out.println("\nLISTANDO UM PRODUTOS");
    }
}
