/*
    PROVA AV1 3POB
    NOME: THIAGO SANTOS POLICARPO
    MATRÍCULA: 2120478300011
    EMAIL: THIAGO.2120478300011@FAETERJ-RIO.EDU.BR
*/
package com.mycompany.av2;
import java.util.Scanner;
import java.util.ArrayList;

public class AV2 {
    
    public static void main(String[] args) {
        
        int opcao, opcaoII, opcaoIII, resultI, resultII;
        char opGrupo;
        Scanner ler = new Scanner(System.in);

        ArrayList <Selecao>selecoes = new ArrayList<>();  
        ArrayList <Confronto>confrontos = new ArrayList<>();  
       
        
        Selecao catar = new Selecao("Catar","Félix Sánchez",'A');
        selecoes.add(catar);
        Selecao equador = new Selecao("Equador","Gustavo Alfaro",'A');
        selecoes.add(equador);
        Selecao senegal = new Selecao("Senegal","Aliou Cissé",'A');
        selecoes.add(senegal);
        Selecao holanda = new Selecao("Holanda","Louis van Gaal",'A');
        selecoes.add(holanda);
        
        Selecao inglaterra = new Selecao("Inglaterra","Gareth Southgate",'B');
        selecoes.add(inglaterra);
        Selecao ira = new Selecao("Irã","Carlos Queiroz",'B');
        selecoes.add(ira);
        Selecao estadosUnidos = new Selecao("Estados Unidos","Gregg Berhalter",'B');
        selecoes.add(estadosUnidos);
        Selecao paisDeGales = new Selecao("País de Gales","Rob Page",'B');
        selecoes.add(paisDeGales);
        
        Selecao argentina = new Selecao("Argentina","Lionel Scaloni",'C');
        selecoes.add(argentina);
        Selecao arabiaSaudita = new Selecao("Arábia Saudita","Hervé Renard",'C');
        selecoes.add(arabiaSaudita);
        Selecao mexico = new Selecao("México","Gerardo Martino",'C');
        selecoes.add(mexico);
        Selecao polonia = new Selecao("Polônia","Czesław Michniewicz",'C');
        selecoes.add(polonia);
        
        Selecao franca = new Selecao("França","Didier Deschamps",'D');
        selecoes.add(franca);
        Selecao australia = new Selecao("Austrália","Graham Arnold",'D');
        selecoes.add(australia);
        Selecao dinamarca = new Selecao("Dinamarca","Kasper Hjulmand",'D');
        selecoes.add(dinamarca);
        Selecao tunisia = new Selecao("Tunísia","Jalel Kadri",'D');
        selecoes.add(tunisia);
        
        Selecao espanha = new Selecao("Espanha","Luis Enrique",'E');
        selecoes.add(espanha);
        Selecao costaRica = new Selecao("Costa Rica","Luis Fernando Suárez",'E');
        selecoes.add(costaRica);
        Selecao alemanha = new Selecao("Alemanha","Hansi Flick",'E');
        selecoes.add(alemanha);
        Selecao japao = new Selecao("Japão","Hajime Moriyasu",'E');
        selecoes.add(japao);
    
        Selecao belgica = new Selecao("Bélgica","Roberto Martínez",'F');
        selecoes.add(belgica);
        Selecao canada = new Selecao("Canadá","John Herdman",'F');
        selecoes.add(canada);
        Selecao marrocos = new Selecao("Marrocos","Walid Regragui",'F');
        selecoes.add(marrocos);
        Selecao croacia = new Selecao("Croácia","Zlatko Dalić",'F');
        selecoes.add(croacia);
        
        Selecao brasil = new Selecao("Brasil","Tite",'G');
        selecoes.add(brasil);
        Selecao servia = new Selecao("Sérvia","Dragan Stojković",'G');
        selecoes.add(servia);
        Selecao suica = new Selecao("Suíça","Murat Yakin",'G');
        selecoes.add(suica);
        Selecao camaroes = new Selecao("Camarões","Rigobert Song",'G');
        selecoes.add(camaroes);
        
        Selecao portugal = new Selecao("Portugal","Fernando Santos",'H');
        selecoes.add(portugal);
        Selecao gana = new Selecao("Gana","Otto Addo",'H');
        selecoes.add(gana);
        Selecao uruguai = new Selecao("Uruguai","Diego Alonso",'H');
        selecoes.add(uruguai);
        Selecao coreiaDoSul = new Selecao("Coréia do Sul","Paulo Bento",'H');
        selecoes.add(coreiaDoSul);
 
        Confronto confronto1 = new Confronto(catar,0,equador,2, true, 20,"11",13,"Estádio Al Bayt");
        confrontos.add(confronto1);
        Confronto confronto2 = new Confronto(senegal,1,holanda,0, true, 21,"11",13,"Estádio Al Bayt");
        confrontos.add(confronto2);
        Confronto confronto3 = new Confronto(catar,6,senegal,5, true, 25,"11",10,"Estádio Al Bayt");
        confrontos.add(confronto3);
        Confronto confronto4 = new Confronto(holanda,4,equador,1, true, 25,"11",13,"Estádio Internacional Khalifa");
        confrontos.add(confronto4);
        Confronto confronto5 = new Confronto(holanda,4,catar,3, false, 29,"11",12,"Estádio Al Bayt");
        confrontos.add(confronto5);
        Confronto confronto6 = new Confronto(equador,2,senegal,2, false, 29,"11",12,"Estádio Internacional Khalifa");
        confrontos.add(confronto6);
        
        Confronto confronto7 = new Confronto(inglaterra,6,ira,4, true, 21,"11",10,"Estádio Internacional Khalifa");
        confrontos.add(confronto7);
        Confronto confronto8 = new Confronto(estadosUnidos,1,paisDeGales,1, true, 21,"11",16,"Estádio Ahmad bin Ali");
        confrontos.add(confronto8);
        Confronto confronto9 = new Confronto(paisDeGales,7,ira,5, true, 25,"11",7,"Estádio Ahmed bin Ali");
        confrontos.add(confronto9);
        Confronto confronto10 = new Confronto(inglaterra,0,estadosUnidos,2, true, 25,"11",16,"Estádio Al Bayt");
        confrontos.add(confronto10);
        Confronto confronto11 = new Confronto(paisDeGales,1,inglaterra,1, false, 29,"11",16,"Estádio Ahmad bin Ali");
        confrontos.add(confronto11);
        Confronto confronto12 = new Confronto(ira,3,estadosUnidos,2, false, 29,"11",16,"Estádio Al Thumama");
        confrontos.add(confronto12);
        
        Confronto confronto13 = new Confronto(argentina,6,arabiaSaudita,6, true, 22,"11",7," Estádio Nacional de Lusail");
        confrontos.add(confronto13);
        Confronto confronto00 = new Confronto(mexico,2,polonia,6, true, 22,"11",13,"Estádio 974");
        confrontos.add(confronto00);
        Confronto confronto15 = new Confronto(polonia,2,arabiaSaudita,2, false, 26,"11",10,"Estádio Cidade da Educação");
        confrontos.add(confronto15);
        Confronto confronto16 = new Confronto(argentina,1,mexico,1, false, 26,"11",16,"Estádio Nacional de Lusail");
        confrontos.add(confronto16);
        Confronto confronto17 = new Confronto(arabiaSaudita,18,mexico,7,  false, 30,"11",16," Estádio Nacional de Lusail");
        confrontos.add(confronto17);
        Confronto confronto18 = new Confronto(polonia,1,argentina,1, false, 30,"11",16,"Estádio 974");
        confrontos.add(confronto18);
        
        Confronto confronto19 = new Confronto(dinamarca,0,tunisia,2, true, 22,"11",10,"Estádio Cidade da Educação");
        confrontos.add(confronto19);
        Confronto confronto20 = new Confronto(franca,0,australia,2, true, 22,"11",16,"Estádio Al Janoub");
        confrontos.add(confronto20);
        Confronto confronto21 = new Confronto(tunisia,3,australia,1, false, 26,"11",7,"Estádio Al Janoub");
        confrontos.add(confronto21);
        Confronto confronto22 = new Confronto(franca,9,dinamarca,8, false, 26,"11",13,"Estádio 974");
        confrontos.add(confronto22);
        Confronto confronto23 = new Confronto(tunisia,5,franca,1, false, 30,"11",12,"Estádio Cidade da Educação");
        confrontos.add(confronto23);
        Confronto confronto24 = new Confronto(australia,1,dinamarca,0, false, 30,"11",12,"Estádio Al Janoub");
        confrontos.add(confronto24);
        
        Confronto confronto25 = new Confronto(alemanha,2,japao,8, true, 23,"11",10,"Estádio Internacional Khalifa");
        confrontos.add(confronto25);
        Confronto confronto26 = new Confronto(espanha,0,costaRica,2, true, 23,"11",13,"Estádio Al Thumama");
        confrontos.add(confronto26);
        Confronto confronto27 = new Confronto(japao,8,costaRica,4, false, 27,"11",7,"Estádio Ahmad bin Ali");
        confrontos.add(confronto27);
        Confronto confronto28 = new Confronto(espanha,3,alemanha,2, false, 27,"11",16,"Estádio Al Bayt");
        confrontos.add(confronto28);
        Confronto confronto29 = new Confronto(japao,0,espanha,1, false, 1,"12",16,"Estádio Internacional Khalifa");
        confrontos.add(confronto29);
        Confronto confronto30 = new Confronto(costaRica,1,alemanha,0, false, 1,"12",16,"Estádio Al Bayt");
        confrontos.add(confronto30);
        
        Confronto confronto31 = new Confronto(marrocos,0,croacia,5, true, 23,"11",7,"Estádio Al Bayt");
        confrontos.add(confronto31);
        Confronto confronto32 = new Confronto(belgica,9,canada,0, true, 23,"11",16,"Estádio Ahmad bin Ali");
        confrontos.add(confronto32);
        Confronto confronto33 = new Confronto(belgica,6,marrocos,9, false, 27,"11",10,"Estádio Al Thumama");
        confrontos.add(confronto33);
        Confronto confronto34 = new Confronto(croacia,1,canada,4, false, 27,"11",13,"Estádio Internacional Khalifa");
        confrontos.add(confronto34);
        Confronto confronto35 = new Confronto(croacia,0,belgica,6, false, 1,"12",12,"Estádio Ahmad bin Ali");
        confrontos.add(confronto35);
        Confronto confronto36 = new Confronto(canada,1,marrocos,2, false, 1,"12",12,"Estádio Al Thumama");
        confrontos.add(confronto36);

        Confronto confronto37 = new Confronto(suica,0,camaroes,1, true, 24,"11",7,"Estádio Al Janoub");
        confrontos.add(confronto37);
        Confronto confronto38 = new Confronto(brasil,9,servia,2, true, 24,"11",16,"Estádio Nacional de Lusail");
        confrontos.add(confronto38);
        Confronto confronto39 = new Confronto(camaroes,2,servia,2, false, 28,"11",7,"Estádio Al Janoub");
        confrontos.add(confronto39);
        Confronto confronto40 = new Confronto(brasil,1,suica,1, false, 28,"11",13,"Estádio 974");
        confrontos.add(confronto40);
        Confronto confronto41 = new Confronto(camaroes,7,brasil,5, false, 2,"12",16,"Estádio Nacional de Lusail");
        confrontos.add(confronto41);
        Confronto confronto42 = new Confronto(servia,3,suica,2, false, 2,"12",16,"Estádio 974");
        confrontos.add(confronto42);

        Confronto confronto43 = new Confronto(uruguai,0,coreiaDoSul,0, true, 24,"11",10,"Estádio Cidade da Educação");
        confrontos.add(confronto43);
        Confronto confronto44 = new Confronto(portugal,4,gana,1, true, 24,"11",13,"Estádio 974");
        confrontos.add(confronto44);
        Confronto confronto45 = new Confronto(coreiaDoSul,0,gana,6, false, 28,"11",10,"Estádio Cidade da Educação");
        confrontos.add(confronto45);
        Confronto confronto46 = new Confronto(portugal,2,uruguai,0, false, 28,"11",16,"Estádio Nacional de Lusail");
        confrontos.add(confronto46);
        Confronto confronto47 = new Confronto(coreiaDoSul,1,portugal,3, false, 2,"12",12,"Estádio Cidade da Educação");
        confrontos.add(confronto47);
        Confronto confronto48 = new Confronto(gana,1,uruguai,0, false, 2,"12",12,"Estádio Al Janoub");
        confrontos.add(confronto48);
        
        
        Menu menu = new Menu();
        do {
        menu.principal();
        opcao = ler.nextInt();
        switch (opcao) {
            case  1 -> {
                for(int i=0;i<confrontos.size();i++) {
                    System.out.print(confrontos.get(i).getSelecao1().getNome() + " x " + confrontos.get(i).getSelecao2().getNome() + "\n"
                            + "Data: " + confrontos.get(i).getDia() + "/" + (confrontos.get(i).getMes() + " Hora: " + confrontos.get(i).getHora() + " Local: " + confrontos.get(i).getLocal()));
                    if(confrontos.get(i).isRealizado() == true) {
                        System.out.println(" Placar: " +  confrontos.get(i).getGolsSelecao1() + " : " + confrontos.get(i).getGolsSelecao2() + "\n" + "");
                    } else {
                        System.out.println(" Placar: Jogo não realizado\n");
                    }
                    
                }   
            }
            case  2 -> {
                    System.out.println("Escolha uma selecao:");
                    for(int i=0;i<selecoes.size();i++) {
                        System.out.println( i + " - " + selecoes.get(i).getNome() );
                    }
                    System.out.print("Opção: ");
                    opcaoII = ler.nextInt();
                            
                    for(int i=0;i<confrontos.size();i++) {
                        if((selecoes.get(opcaoII).getNome() == confrontos.get(i).getSelecao1().getNome()) || selecoes.get(opcaoII).getNome() == confrontos.get(i).getSelecao2().getNome() ) {
                            System.out.print(confrontos.get(i).getSelecao1().getNome() + " x " + confrontos.get(i).getSelecao2().getNome() + "\n"
                            + "Data: " + confrontos.get(i).getDia() + "/" + (confrontos.get(i).getMes() + " Hora: " + confrontos.get(i).getHora() + " Local: " + confrontos.get(i).getLocal()));
                            if(confrontos.get(i).isRealizado() == true) {
                                System.out.println(" Placar: " +  confrontos.get(i).getGolsSelecao1() + " : " + confrontos.get(i).getGolsSelecao2() + "\n1" + "");
                            } else {
                                System.out.println(" Placar: Jogo não realizado\n");
                            }
                        }
                    }
            }
            case  3 -> {
                System.out.println("Escolha um grupo de A até H:");
                System.out.print("Opção: ");
                opGrupo = ler.next().charAt(0);
                System.out.println("Character: "+opGrupo);
                
                for(int i=0;i<confrontos.size();i++) {
                    if((confrontos.get(i).getSelecao1().getGrupo() == opGrupo) || (confrontos.get(i).getSelecao2().getGrupo() == opGrupo) ) {
                        System.out.print(confrontos.get(i).getSelecao1().getNome() + " x " + confrontos.get(i).getSelecao2().getNome() + "\n"
                        + "Data: " + confrontos.get(i).getDia() + "/" + (confrontos.get(i).getMes() + " Hora: " + confrontos.get(i).getHora() + " Local: " + confrontos.get(i).getLocal()));
                        if(confrontos.get(i).isRealizado() == true) {
                            System.out.println(" Placar: " +  confrontos.get(i).getGolsSelecao1() + " : " + confrontos.get(i).getGolsSelecao2() + "\n1" + "");
                        } else {
                            System.out.println(" Placar: Jogo não realizado\n");
                        }
                    }
                }
            }
            case  4 -> {
                 System.out.println("Escolha selecao 1:");
                 for(int i=0;i<selecoes.size();i++) {
                    System.out.println( i + " - " + selecoes.get(i).getNome() );
                 }
                 System.out.print("Opção: ");
                 opcaoII = ler.nextInt();
                 
                 System.out.println("Escolha selecao 2:");
                 for(int i=0;i<selecoes.size();i++) {
                    System.out.println( i + " - " + selecoes.get(i).getNome() );
                 }
                 System.out.print("Opção: ");
                 opcaoIII = ler.nextInt();
                 
                 for(int i=0;i<confrontos.size();i++) {
                    if(((selecoes.get(opcaoII).getNome() == confrontos.get(i).getSelecao1().getNome()) && (selecoes.get(opcaoIII).getNome() == confrontos.get(i).getSelecao2().getNome())) || ((selecoes.get(opcaoII).getNome() == confrontos.get(i).getSelecao2().getNome()) && (selecoes.get(opcaoIII).getNome() == confrontos.get(i).getSelecao1().getNome())) ){
                        System.out.println("Informe qt de gols do time 1:");
                        resultI = ler.nextInt();
                        System.out.println("Informe qt de gols do time 2:");
                        resultII = ler.nextInt();
                        confrontos.get(i).setGolsSelecao1(resultI);
                        confrontos.get(i).setGolsSelecao2(resultII);
                        break;
                    }
                    System.out.println("Partida não encontrada!");
                 }
                
            }  
           
        }
        } while (opcao != 5);
    }
}
