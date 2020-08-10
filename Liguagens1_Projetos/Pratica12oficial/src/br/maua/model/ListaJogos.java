package br.maua.model;

import java.util.ArrayList;
import java.util.List;

public class ListaJogos {
    private List<Jogo> minhaListadeJogo;

    public ListaJogos() {
        this.minhaListadeJogo = new ArrayList<>();
    }

    public void addJogo(Jogo jogo){
        this.minhaListadeJogo.add(jogo);
    }

    @Override
    public String toString() {
        return "ListaJogos{" +
                "minhaListadeJogo=" + minhaListadeJogo +
                '}';
    }

    public final List<Jogo> getJogos() {
        return this.minhaListadeJogo;
    }
}
