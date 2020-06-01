package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();
        CalculosAritmeticos calculosAritmeticos = new CalculosAritmeticos();
        Retangular retangular = new Retangular(0.0, 0.0);
        Polar polar = new Polar(0.0, 0.0);
        boolean status = true;

        do {
            System.out.println("\nEscolha o metodo que ira utilizar");

            menu();

            int escolha = ler.nextInt();

            switch (escolha) {
                case 0:
                    System.out.println("Programa Fechado.");
                    status = false;
                    break;
                case 1:
                    conversor.menu();
                    escolha = ler.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Digite a parte Real: ");
                            retangular.setRealComplexo(ler.nextDouble());

                            System.out.println("Digite a parte Imaginaria: ");
                            retangular.setImaginarioComplexo(ler.nextDouble());

                            retangular.exibeValorConvertido();
                            break;
                        case 2:
                            System.out.println("Digite o modulo: ");
                            polar.setModulo(ler.nextDouble());

                            System.out.println("Digite a fase: ");
                            polar.setFase(ler.nextDouble());

                            polar.exibeValorConvertido();

                            break;
                    }
                    break;
                case 2:
                    calculosAritmeticos.menu();
                    escolha = ler.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("\n1 - Retangular * Retangular");
                            System.out.println("2 - Polar * Polar\n");
                            escolha = ler.nextInt();
                            switch (escolha) {
                                case 1:
                                    calculosAritmeticos.multiplicaoRetangular();
                                    break;
                                case 2:
                                    calculosAritmeticos.multiplicacaoPolar();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("\n1 - Retangular / Retangular ");
                            System.out.println("2 - Polares / Polares \n");
                            escolha = ler.nextInt();
                            switch (escolha) {
                                case 1:
                                    calculosAritmeticos.divisaoRetangular();
                                    break;
                                case 2:
                                    calculosAritmeticos.divisaoPolar();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("\n1 - Retangular + Retangular ");
                            System.out.println("2 - Polares + Polares \n");
                            escolha = ler.nextInt();
                            switch (escolha) {
                                case 1:
                                    calculosAritmeticos.somaRetangular();
                                    break;
                                case 2:
                                    calculosAritmeticos.subtracaoPolar();
                                    break;
                            }
                    }
                    break;
            }
        }while (status) ;
    }

    public static void menu(){
        System.out.println("\n0 - Sair do programa");
        System.out.println("1 - Conversor");
        System.out.println("2 - Calculos aritmeticos\n");
    }

}
