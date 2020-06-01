package com.company;
import java.lang.Math;

public class Conversor {

    public void menu(){
        System.out.println("1 - Retangular para Polar.");
        System.out.println("2 - Polar para Retangular");
    }

    public String[] retangularPolar(double real, double imaginario){

        double modulo =  Math.sqrt((Math.pow(real,2.0) + Math.pow(imaginario,2.0)));
        double fase = Math.atan(imaginario/real);

        String polar = modulo + ";" + Math.toDegrees(fase);
        String[] numPolar = polar.split(";");
        return numPolar;
    }

    public String[] polarRetangular(double modulo, double fase){

        double real = Math.cos(Math.toRadians(fase))* modulo ;
        double imaginario = Math.sin(Math.toRadians(fase)) * modulo ;

        String retangular = real + ";" + imaginario;
        String[] numRetangular = retangular.split(";");
        return numRetangular;
    }

}
