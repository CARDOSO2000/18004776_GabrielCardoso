package br.maua.game;

import br.maua.Models.PicturePokerCard;
import br.maua.Models.PicturePokerPack;

import java.util.ArrayList;
import java.util.List;

public class PicturePokerDealer {
    private String name;
    private PicturePokerPack deck;

    public PicturePokerDealer(String name) {
        this.name = name;
        this.deck = new PicturePokerPack();
    }
    public List<PicturePokerCard> giveHand(){
        List<PicturePokerCard> newHand = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            newHand.add(deck.getRandomCard());
        }
        return newHand;
    }

    public String getName() {
        return name;
    }

    public PicturePokerPack getDeck() {
        return deck;
    }
}
