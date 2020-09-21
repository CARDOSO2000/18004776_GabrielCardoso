package br.maua;

import java.util.LinkedList;

public class SList {
    private LinkedList<Integer> Lista = new LinkedList<>();

    public void insereInicio(Integer v){
            Lista.add(v);
        }


    @Override
    public String toString() {
        return "SList{" +
                "Lista=" + Lista +
                '}';
    }
}
