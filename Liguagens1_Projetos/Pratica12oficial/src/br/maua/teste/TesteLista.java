package br.maua.teste;

import br.maua.model.Jogo;
import br.maua.model.ListaJogos;

public class TesteLista {
    public static void main(String[] args) {
        ListaJogos jogos = new ListaJogos();

        System.out.println("Lista Atual:" + jogos);

        Jogo jogo1 = new Jogo("PC", "LoL");
        Jogo jogo2 = new Jogo("PC", "Diablo 3");
        Jogo jogo3 = new Jogo("PC", "Halo");

        jogos.addJogo(jogo1);
        jogos.addJogo(jogo2);
        jogos.addJogo(jogo3);

        System.out.println("Lista Atual:" + jogos);
    }


}
