package com.mycompany.av1_3pob;

import java.util.Scanner;

public class Produto {
    private static int qtProdutos = 0;
    private int id;
    private String codigoDeBarras;
    private String sku;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    private double peso;

    
    public Produto(String codigoDeBarras, String sku, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {
        this.id = ++qtProdutos;
        this.codigoDeBarras = codigoDeBarras;
        this.sku = sku;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.peso = peso;
        this.fabricante = fabricante;
    }


    private String fabricante;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    //Cria e retorna uma inst??ncia do objeto produto a partir de uma captura de dados do usu??rio.
    public void obterProduto() {
        Scanner ler = new Scanner(System.in);
            
        System.out.printf("Insira o C??digo de Barras: ");
        this.codigoDeBarras = ler.nextLine();
           
        System.out.printf("Insira o SKU: ");
        this.sku = ler.nextLine();
            
        System.out.printf("Insira o nome do produto: ");
        this.nome = ler.nextLine();
            
        System.out.printf("Insira a descri????o: ");
        this.descricao = ler.nextLine();
            
        System.out.printf("Insira a categoria: ");
        this.categoria = ler.nextLine();
            
        System.out.printf("Insira o pre??o: ");
        this.preco = ler.nextDouble();
            
        System.out.printf("Insira o peso: ");
        this.peso = ler.nextDouble();
            
        System.out.printf("Insira o fabricante: ");
        ler.nextLine();
        this.fabricante = ler.nextLine();  
    }
    
    public void exibe() {
        System.out.println("\nID: " + this.id); 
        System.out.println("C??digo de barras: " + this.codigoDeBarras); 
        System.out.println("SKU: " + this.sku); 
        System.out.println("Nome: " + this.nome); 
        System.out.println("Descri????o: " + this.descricao); 
        System.out.println("Categoria: " + this.categoria); 
        System.out.println("Pre??o: R$" + this.preco); 
        System.out.println("Peso: " + this.peso); 
        System.out.println("Fabricante: " + this.fabricante + "\n"); 
    }
    
    public void exibeApenasNome() {
        System.out.println("Nome: " + this.nome); 
     
    }
    
}
