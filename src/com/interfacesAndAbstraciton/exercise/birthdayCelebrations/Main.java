package com.interfacesAndAbstraciton.exercise.birthdayCelebrations;

import com.interfacesAndAbstraciton.exercise.birthdayCelebrations.entity.interfaces.Pet;
import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.Citizen;
import com.interfacesAndAbstraciton.exercise.multipleImplementation.entity.interfaces.Birthable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        List<Birthable> birthableList = new ArrayList<>();

        while (!"End".equals(input)) {

            try {
                birthableList.add(parseBirthable(input));
            } catch (IllegalArgumentException e) {
                e.getCause();
            }

            input = reader.readLine();
        }

        if (!birthableList.isEmpty()) {
            String year = reader.readLine();
            printBornInYear(birthableList, year);
        }

    }

    private static void printBornInYear(List<Birthable> birthableList, String year) {
        birthableList.stream()
                .map(Birthable::getBirthDate)
                .filter(date -> date.endsWith(year))
                .forEach(System.out::println);
    }

    private static Birthable parseBirthable(String input) {
        String[] info = input.split("\\s+");

        return switch (info[0]) {
            case "Citizen" -> new Citizen(info[1], Integer.parseInt(info[2]), info[3], info[4]);
            case "Pet" -> new Pet(info[1], info[2]);
            default -> throw new IllegalArgumentException("Cannot parse " + info[0] + " to birthable!");
        };
    }
}
