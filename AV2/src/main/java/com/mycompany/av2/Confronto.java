
package com.mycompany.av2;

public class Confronto {
    
    private Selecao selecao1;
    private int golsSelecao1;
    private Selecao selecao2;
    private int golsSelecao2;
    private boolean realizado;
    private int dia;
    private String mes; 
    private int hora;
    private String local;

    public Confronto(Selecao selecao1, int golsSelecao1, Selecao selecao2, int golsSelecao2, boolean realizado, int dia, String mes, int hora, String local) {
        this.selecao1 = selecao1;
        this.golsSelecao1 = golsSelecao1;
        this.selecao2 = selecao2;
        this.golsSelecao2 = golsSelecao2;
        this.realizado = realizado;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.local = local;
    }
    

    public int getGolsSelecao1() {
        return golsSelecao1;
    }

    public void setGolsSelecao1(int golsSelecao1) {
        this.golsSelecao1 = golsSelecao1;
    }

    public int getGolsSelecao2() {
        return golsSelecao2;
    }

    public void setGolsSelecao2(int golsSelecao2) {
        this.golsSelecao2 = golsSelecao2;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Selecao getSelecao1() {
        return selecao1;
    }

    public void setSelecao1(Selecao selecao1) {
        this.selecao1 = selecao1;
    }

    public Selecao getSelecao2() {
        return selecao2;
    }

    public void setSelecao2(Selecao selecao2) {
        this.selecao2 = selecao2;
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

   
}
