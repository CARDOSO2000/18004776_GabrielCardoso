package com.company;

public class Polar {
    public double modulo = 0.0;
    public double fase = 0.0; //Graus

    public Polar(double modulo, double fase) {
        this.modulo = modulo;
        this.fase = fase;
    }


    public void setModulo(double modulo) {
        this.modulo = modulo;
    }


    public void setFase(double fase) {
        this.fase = fase;
    }

    public void exibeValorConvertido(){
        Conversor conversor = new Conversor();

        String[] retangular1 = conversor.polarRetangular(this.modulo,this.fase);

        double real = Double.parseDouble(retangular1[0]);
        double imaginario = Double.parseDouble(retangular1[1]);

        real = Math.round( real  * 100000) / 100000d;
        imaginario = Math.round( imaginario  * 100000) / 100000d;

        System.out.println("Real: " + real + " Imaginario: " + imaginario + "\n");
    }
}
