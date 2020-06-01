package com.company;

public class Ninja {
    private String name;
    private String family;
    private String[] jutsus;

    public Ninja (String nome, String familia){
        this.name = nome;
        this.family = familia;
        jutsus = new String[5];
    }

    public void train(){
        System.out.println("Hoho!");
    }
}
