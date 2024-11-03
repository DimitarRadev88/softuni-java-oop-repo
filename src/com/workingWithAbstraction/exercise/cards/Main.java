package com.workingWithAbstraction.exercise.cards;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        cardSuit();
//        cardRank();
        cardsWithPower();
    }

    private static void cardsWithPower() {
        Scanner scanner = new Scanner(System.in);

        DeckOfCards deck = new DeckOfCards(CardDeckGenerator.generateDeck());
        CardRank rank = CardRank.valueOf(scanner.nextLine());
        CardSuit suit = CardSuit.valueOf(scanner.nextLine());

        System.out.println(deck.getCard(rank, suit));
    }

    private static void cardRank() {
        System.out.println("Card Ranks:");
        Arrays.stream(CardRank.values())
                .forEach(r -> printEnumOrdinalValueAndName(r.ordinal(), r.name()));
    }

    private static void cardSuit() {
        System.out.println("Card Suits:");
        Arrays.stream(CardSuit.values())
                .forEach(s -> printEnumOrdinalValueAndName(s.ordinal(), s.name()));
    }

    private static void printEnumOrdinalValueAndName(int ordinal, String name) {
        System.out.printf("Ordinal value: %d; Name value: %s%n", ordinal, name);
    }
}
