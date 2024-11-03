package com.workingWithAbstraction.exercise.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDeckGenerator {
    public static List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();

        Arrays.stream(CardRank.values()).forEach(rank -> {
            Arrays.stream(CardSuit.values()).forEach(suit -> {
                deck.add(new Card(rank, suit));
            });
        });

        return deck;
    }
}
