package com.workingWithAbstraction.exercise.cards;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;
    private int power;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
        this.power = cardRank.getPower() + cardSuit.getPower();
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(), this.power);
    }
}
