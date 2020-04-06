package com.company;

public class MinhaClasse {
    private static int contaObjetos = 0;

    public MinhaClasse(){
        contaObjetos = contaObjetos + 1;
    }

    public int getContaObjetos(){
        return contaObjetos;
    }
}