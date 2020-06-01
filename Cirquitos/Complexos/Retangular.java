package com.company;

public class Retangular {
    private double realComplexo = 0.0;
    private double imaginarioComplexo = 0.0;

    public Retangular(double realComplexo, double imaginarioComplexo) {
        this.realComplexo = realComplexo;
        this.imaginarioComplexo = imaginarioComplexo;
    }


    public void setRealComplexo(double realComplexo) {
        this.realComplexo = realComplexo;
    }

    public void setImaginarioComplexo(double imaginarioComplexo) {
        this.imaginarioComplexo = imaginarioComplexo;
    }

    public void exibeValorConvertido(){
        Conversor conversor = new Conversor();

        String[] polar1 = conversor.retangularPolar(this.realComplexo,this.imaginarioComplexo);

        double modulo1 = Double.parseDouble(polar1[0]) ;
        double fase1 = Double.parseDouble(polar1[1]);

        modulo1 = Math.round( modulo1  * 100000) / 100000d;
        fase1 = Math.round( fase1  * 100000) / 100000d;

        System.out.println("Modulo: " + modulo1 +" Fase: " + fase1 + "\n");
    }
}
