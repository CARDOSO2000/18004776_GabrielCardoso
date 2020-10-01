package br.maua;

import java.util.ArrayList;

public class Estados {
    public void Fechamento(Grafo grafo){
        ArrayList<String> vertice = new ArrayList<>();
        ArrayList<ArrayList> elemento = new ArrayList<>();
        ArrayList<String> worklist = new ArrayList<>();
        int n = 0;
        for (Vertice novo:grafo.getVertices()
             ) {

            worklist.add(novo.getNome());
        }
        do{
            n = n(n);
            worklist.remove(n);


        }while (worklist == null);


    }
    public int n(int n){
        if(n <= 10){
            n++;
        }else {
            n = 0;
        }
        return n;
    }
    public void addArrey(ArrayList a, String b){
        ArrayList<String> c = new ArrayList<>();

    }

}
