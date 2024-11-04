package com.encapsulation.lab.firstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());

        Person[] players = new Person[count];
        for (int i = 0; i < players.length; i++) {
            String input = reader.readLine();
            players[i] = createPerson(input);
        }

        Team team = new Team("Black Eagles");
        for (Person player : players) {
            team.addPlayer(player);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");

    }

    private static Person createPerson(String input) {
        String[] info = input.split(" ");
        try {
            return new Person(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
