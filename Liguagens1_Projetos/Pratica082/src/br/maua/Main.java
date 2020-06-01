package br.maua;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("Fim da mainn");

    }
    static void metodo1(){
        System.out.println("Inicio metodo 1");
        metodo2();
        System.out.println("Fim metodo 2");
    }
    static void metodo2(){
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        for (int i = 0; i <= 15; i++){
            try{
                array[i] = i;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Tentou acessar posição invalida:"+i);
            }
            System.out.println(i);
        }
        System.out.println("Fim do matodo 2");
    }
}
