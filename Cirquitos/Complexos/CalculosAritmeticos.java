package com.company;

import java.util.Scanner;

public class CalculosAritmeticos {
    public void menu(){
        System.out.println("\n1 - Multiplicacao");
        System.out.println("2 - Divisao");
        System.out.println("3 - Adicao");
        System.out.println("4 - Subtracao");
    }

    public void multiplicaoRetangular(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite a parte Real: ");
        double real1 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario1 = ler.nextDouble();


        String[] polarAux1 = conversor.retangularPolar(real1, imaginario1);


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte Real: ");
        double real2 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario2 = ler.nextDouble();


        String[] polarAux2 = conversor.retangularPolar(real2, imaginario2);

        double modulo = Double.parseDouble(polarAux1[0]) * Double.parseDouble(polarAux2[0]) ;
        double fase = Double.parseDouble(polarAux1[1]) + Double.parseDouble(polarAux2[1]) ;

        Polar polar = new Polar(modulo,fase);

        modulo = Math.round( modulo  * 100000) / 100000d;
        fase = Math.round( fase  * 100000) / 100000d;

        System.out.println("\nA multiplicação na notação polar: ");
        System.out.println("Modulo: " + modulo + " Fase: " + fase + "\n");


        System.out.println("A multiplicação na notação retangular: ");
        polar.exibeValorConvertido();
    }

    public void divisaoRetangular(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite a parte Real: ");
        double real1 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario1 = ler.nextDouble();


        String[] polarAux1 = conversor.retangularPolar(real1, imaginario1);


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte Real: ");
        double real2 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario2 = ler.nextDouble();


        String[] polarAux2 = conversor.retangularPolar(real2, imaginario2);

        double modulo = Double.parseDouble(polarAux1[0]) / Double.parseDouble(polarAux2[0]) ;
        double fase = Double.parseDouble(polarAux1[1]) - Double.parseDouble(polarAux2[1]) ;

        Polar polar = new Polar(modulo,fase);

        modulo = Math.round( modulo  * 100000) / 100000d;
        fase = Math.round( fase  * 100000) / 100000d;

        System.out.println("\nA divisao na notação polar: ");
        System.out.println("Modulo: " + modulo + " Fase: " + fase + "\n");


        System.out.println("A divisao na notação retangular: ");
        polar.exibeValorConvertido();
    }

    public void multiplicacaoPolar(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite o modulo: ");
        double modulo1 = ler.nextDouble();

        System.out.println("    Digite a fase: ");
        double fase1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte modulo: ");
        double modulo2 = ler.nextDouble();

        System.out.println("    Digite a parte fase: ");
        double fase2 = ler.nextDouble();


        double modulo = modulo1 * modulo2 ;
        double fase = fase1 + fase2 ;

        Polar polar = new Polar(modulo,fase);

        modulo = Math.round( modulo  * 100000) / 100000d;
        fase = Math.round( fase  * 100000) / 100000d;

        System.out.println("\nA divisao na notação polar: ");
        System.out.println("Modulo: " + modulo + " Fase: " + fase + "\n");


        System.out.println("A divisao na notação retangular: ");
        polar.exibeValorConvertido();

    }

    public void divisaoPolar(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite o modulo: ");
        double modulo1 = ler.nextDouble();

        System.out.println("    Digite a fase: ");
        double fase1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte modulo: ");
        double modulo2 = ler.nextDouble();

        System.out.println("    Digite a parte fase: ");
        double fase2 = ler.nextDouble();


        double modulo = modulo1 / modulo2 ;
        double fase = fase1 - fase2 ;

        Polar polar = new Polar(modulo,fase);

        modulo = Math.round( modulo  * 100000) / 100000d;
        fase = Math.round( fase  * 100000) / 100000d;

        System.out.println("\nA divisao na notação polar: ");
        System.out.println("Modulo: " + modulo + " Fase: " + fase + "\n");


        System.out.println("A divisao na notação retangular: ");
        polar.exibeValorConvertido();

    }

    public void somaRetangular(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite a parte Real: ");
        double real1 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte Real: ");
        double real2 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario2 = ler.nextDouble();


        double real = real1 + real2 ;
        double imaginario = imaginario1 + imaginario1;

        Retangular retangular = new Retangular(real, imaginario);

        real = Math.round( real  * 100000) / 100000d;
        imaginario = Math.round( imaginario  * 100000) / 100000d;

        System.out.println("\nA soma da notação retangular: ");
        System.out.println("Modulo: " + real + " Fase: " + imaginario + "\n");


        System.out.println("A divisao na notação retangular: ");
        retangular.exibeValorConvertido();

    }

    public void subtracaoRetangular(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite a parte Real: ");
        double real1 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte Real: ");
        double real2 = ler.nextDouble();

        System.out.println("    Digite a parte Imaginaria: ");
        double imaginario2 = ler.nextDouble();


        double real = real1 - real2 ;
        double imaginario = imaginario1 - imaginario1;

        Retangular retangular = new Retangular(real, imaginario);

        real = Math.round( real  * 100000) / 100000d;
        imaginario = Math.round( imaginario  * 100000) / 100000d;

        System.out.println("\nA soma da notação retangular: ");
        System.out.println("Modulo: " + real + " Fase: " + imaginario + "\n");


        System.out.println("A divisao na notação retangular: ");
        retangular.exibeValorConvertido();

    }

    public void somaPolar(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite o modulo: ");
        double modulo1 = ler.nextDouble();

        System.out.println("    Digite a fase: ");
        double fase1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte modulo: ");
        double modulo2 = ler.nextDouble();

        System.out.println("    Digite a parte fase: ");
        double fase2 = ler.nextDouble();

        String[] retangular1 = conversor.polarRetangular(modulo1, fase1);
        String[] retangular2 = conversor.polarRetangular(modulo2, fase2);

        double real = Double.parseDouble(retangular1[0]) + Double.parseDouble(retangular2[0]) ;
        double imaginaria = Double.parseDouble(retangular1[1]) + Double.parseDouble(retangular2[1]) ;

        Retangular retangular = new Retangular(real, imaginaria);

        real = Math.round( real  * 100000) / 100000d;
        imaginaria = Math.round( imaginaria  * 100000) / 100000d;

        System.out.println("\nA soma na notação retangular: ");
        System.out.println("Modulo: " + real + " Fase: " + imaginaria + "\n");

        System.out.println("A soma na notação polar: ");
        retangular.exibeValorConvertido();

    }
    public void subtracaoPolar(){
        Scanner ler = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("\nPrimeiro complexo");

        System.out.println("    Digite o modulo: ");
        double modulo1 = ler.nextDouble();

        System.out.println("    Digite a fase: ");
        double fase1 = ler.nextDouble();


        System.out.println("\nSegundo complexo");

        System.out.println("    Digite a parte modulo: ");
        double modulo2 = ler.nextDouble();

        System.out.println("    Digite a parte fase: ");
        double fase2 = ler.nextDouble();

        String[] retangular1 = conversor.polarRetangular(modulo1, fase1);
        String[] retangular2 = conversor.polarRetangular(modulo2, fase2);

        double real = Double.parseDouble(retangular1[0]) - Double.parseDouble(retangular2[0]) ;
        double imaginaria = Double.parseDouble(retangular1[1]) - Double.parseDouble(retangular2[1]) ;

        Retangular retangular = new Retangular(real, imaginaria);

        real = Math.round( real  * 100000) / 100000d;
        imaginaria = Math.round( imaginaria  * 100000) / 100000d;

        System.out.println("\nA soma na notação retangular: ");
        System.out.println("Modulo: " + real + " Fase: " + imaginaria + "\n");

        System.out.println("A soma na notação polar: ");
        retangular.exibeValorConvertido();

    }
}
