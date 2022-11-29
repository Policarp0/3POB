
package com.mycompany.av2;

public class Selecao {
    
    private String nome;
    private String tecnico;
    private char grupo;

    public Selecao(String nome, String tecnico, char grupo) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
  
}
