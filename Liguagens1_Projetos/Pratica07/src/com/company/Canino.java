package com.company;

public abstract class Canino extends Animal implements Locomover {
    public abstract void cheirar();
    @Override
    public void locomover(){
        System.out.println("Andando!");
    }
}
