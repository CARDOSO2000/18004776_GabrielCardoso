package br.maua.game;

import br.maua.Interfaces.CheckHand;
import br.maua.Models.PicturePokerCard;
import br.maua.Models.PicturePokerCardValues;
import br.maua.Models.PicturePokerHandVAlues;

import java.util.HashMap;
import java.util.List;

public class Handa implements CheckHand {
    private List<PicturePokerCard> hand;

    public Handa(List<PicturePokerCard> hand) {
        this.hand = hand;
    }

    public List<PicturePokerCard> getHand() {
        return hand;
    }

    @Override
    public PicturePokerHandVAlues checkHand(List<PicturePokerCard> cardList) {
        PicturePokerHandVAlues handValue = PicturePokerHandVAlues.NONE;
        HashMap<PicturePokerCardValues, Integer> handMap = new HashMap<>();
        for(PicturePokerCardValues value: PicturePokerCardValues.values()){
            handMap.put(value,0);
        }
        for (PicturePokerCard card: cardList) {
            handMap.replace(card.getValue(), handMap.get(card.getValue())+1);
        }
        handMap.forEach((picturePokerCardValues, integer) -> {
            System.out.println("Chave:"+ picturePokerCardValues + "Value:"+ integer);
        });
        if(handMap.containsValue(5)){
            handValue = PicturePokerHandVAlues.FLUSH;
        }else if(handMap.containsValue(4)){
            handValue = PicturePokerHandVAlues.FOUR_OF_KIND;
        }else if(handMap.containsValue(3) && handMap.containsValue(2)){
            handValue = PicturePokerHandVAlues.FULL_HOUSE;
        }else if(handMap.containsValue(3)){
            handValue = PicturePokerHandVAlues.THREE_OF_KIND;
        }else if(handMap.containsValue(2)){
            int pair = 0;
            for (int value:handMap.values()) {
                if(value == 2)pair++;
            }
            if(pair==2){
                handValue = PicturePokerHandVAlues.TWO_PAIRS;
            }else{
                handValue = PicturePokerHandVAlues.ONE_PAIR;
            }
        }else{
            handValue = PicturePokerHandVAlues.NONE;
        }
        return handValue;
    }
}
