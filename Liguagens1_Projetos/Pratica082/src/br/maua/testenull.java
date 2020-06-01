package br.maua;

public class testenull {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = frase.toUpperCase();
        System.out.println("Frase Original:" + frase);
        System.out.println("Frase Modificada:" + novaFrase);
    }
}
