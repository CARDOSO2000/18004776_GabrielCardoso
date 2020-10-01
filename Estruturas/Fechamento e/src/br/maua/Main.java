package br.maua;

public class Main {

    public static void main(String[] args) {
	Grafo grafo = new Grafo();
	Estados estados = new Estados();
	    grafo.addVertice("q0");
        grafo.addVertice("q1");
        grafo.addVertice("q2");
        grafo.addVertice("q3");
        grafo.addVertice("q4");
        grafo.addVertice("q5");
        grafo.addVertice("q6");
        grafo.addVertice("q7");
        grafo.addVertice("q8");
        grafo.addVertice("q9");
        grafo.addVertice("q10");
        grafo.addAresta(0,"q0","q1");
        grafo.addAresta(0,"q1","q2");
        grafo.addAresta(0,"q1","q10");
        grafo.addAresta(0,"q2","q3");
        grafo.addAresta(0,"q2","q4");
        grafo.addAresta(0,"q2","q5");
        grafo.addAresta(1,"q3","q6");
        grafo.addAresta(2,"q4","q7");
        grafo.addAresta(3,"q5","q8");
        grafo.addAresta(0,"q6","q9");
        grafo.addAresta(0,"q7","q9");
        grafo.addAresta(0,"q8","q9");
        grafo.addAresta(0,"q9","q10");
        grafo.addAresta(0,"q9","q2");
        estados.Fechamento(grafo);
    }
}
