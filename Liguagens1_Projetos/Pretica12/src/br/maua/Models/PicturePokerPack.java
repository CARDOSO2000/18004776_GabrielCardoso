package br.maua.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PicturePokerPack {
    private List<PicturePokerCard> decklist;

    public PicturePokerPack() {
        this.decklist = criarDeckList();
    }
    private List<PicturePokerCard> criarDeckList(){
        List<PicturePokerCard> novoBaralho = new ArrayList<>();
        for(PicturePokerCardValues value : PicturePokerCardValues.values() ){
            for(int i = 1; i <=5; i++){
                novoBaralho.add(new PicturePokerCard(value, i));
            }
        }
        return novoBaralho;
    }

    public List<PicturePokerCard> getDecklist() {
        return decklist;
    }

    public PicturePokerCard getRandomCard() {
        return decklist.remove(new Random().nextInt(decklist.size()));
    }
}
