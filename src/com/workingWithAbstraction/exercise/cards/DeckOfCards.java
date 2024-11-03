package com.workingWithAbstraction.exercise.cards;

import java.util.List;

public class DeckOfCards {
    private List<Card> deck;

    public DeckOfCards(List<Card> deckOfCards) {
        this.deck = deckOfCards;
    }

    public Card getCard(CardRank rank, CardSuit suit) {
        return deck.stream()
                .filter(card -> card.getCardRank().equals(rank) && card.getCardSuit().equals(suit))
                .findFirst()
                .get();
    }
}
