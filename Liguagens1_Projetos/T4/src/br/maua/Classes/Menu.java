package br.maua.Classes;

import br.maua.Enum.Raca;

import java.util.Scanner;

public class Menu {


void apresentação(){

    System.out.println("Bem vindo!");
    int n = 1;
    String nome;
    int i;
    Scanner scanner = new Scanner(System.in);
    while (n != 0 ){
        System.out.println("Oque voce deseja fazer?");
        System.out.println("1- Criar um personagem");
        System.out.println("2- Deletar personagem");
        System.out.println("3- Alterar Personagem");
        n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Qual Nome?");
                nome = scanner.nextLine();
                System.out.println("Qual a raça?");
                System.out.println("1- {"+ "\n"+ Raca.KHAJIIT +"\n"
                        +"  Profissoes: Ladrao(Melhor), Guerreiro ou Arqueiro"
                        +"\n"+"Descrissao: Os Khajiit são uma raça com aspecto felino, oriundos de uma província de Elseweyr. Têm a capacidade de ver no escuro e são muito ágeis e inteligentes. }"+"\n");
                System.out.println("2- {"+"\n" + Raca.ARGONIANS + "Profissoes: Ladrao, Mago "
                        +"\n");

                break;
        }
    }
}

}