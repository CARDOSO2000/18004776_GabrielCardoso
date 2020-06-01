package br.maua.Interfaces;

import br.maua.Models.PicturePokerCard;
import br.maua.Models.PicturePokerHandVAlues;
import br.maua.game.PicturePoker;

import java.util.List;

public interface CheckHand {
    PicturePokerHandVAlues checkHand(List<PicturePokerCard> cardList);
}
