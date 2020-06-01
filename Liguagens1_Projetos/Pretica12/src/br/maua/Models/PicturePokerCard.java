package br.maua.Models;

public class PicturePokerCard {
    private PicturePokerCardValues value;
    private int id;

    public PicturePokerCard(PicturePokerCardValues value, int id){
        this.value = value;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public PicturePokerCardValues getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PicturePokerCard{" +
                "value=" + value +
                ", id=" + id +
                '}';
    }
}
