package br.maua.game;

import br.maua.Models.PicturePokerCard;
import br.maua.Models.PicturePokerPack;

import java.util.List;

public class PicturePoker {
    public static void run(){
        System.out.println("Mario Poker!");
        PicturePokerDealer dealer = new PicturePokerDealer("Luigi");
        System.out.println("NOME" + dealer.getName());
        System.out.println("BARALHO:");
        PicturePokerPack deck = new PicturePokerPack();
        show(dealer.getDeck().getDecklist());
        Handa hand1 = new Handa(dealer.giveHand());
        System.out.println("\n\nMAO ATUAL1");
        show(hand1.getHand());
        System.out.println("Valor da MAo:"+ hand1.checkHand(hand1.getHand()));
        Handa hand2 = new Handa(dealer.giveHand());
        System.out.println("\n\nMAO ATUAL2");
        show(hand2.getHand());
        System.out.println("Valor da MAo:"+ hand2.checkHand(hand2.getHand()));
    }

    private static void show(List<PicturePokerCard> cardList) {
        System.out.println("Size:" + cardList.size());
        for (PicturePokerCard card: cardList){
            System.out.println(card);
        }
    }
}
