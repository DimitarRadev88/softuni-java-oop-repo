package com.workingWithAbstraction.exercise.jediGalaxy;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Galaxy galaxy = createGalaxy(scanner);
        parseInput(scanner, galaxy);

        System.out.println(galaxy.getJedi().getStars());
    }

    private static void parseInput(Scanner scanner, Galaxy galaxy) {
        String input = scanner.nextLine();
        while (!"Let the Force be with you".equals(input)) {
            int[] jediCoordinates = parseIntArray(input.split(" "));
            int[] evilCoordinates = parseIntArray(scanner.nextLine().split(" "));

            galaxy.getJedi().setRow(jediCoordinates[0]);
            galaxy.getJedi().setCol(jediCoordinates[1]);

            galaxy.getEvil().setRow(evilCoordinates[0]);
            galaxy.getEvil().setCol(evilCoordinates[1]);

            galaxy.destroyStars();
            galaxy.collectStars();

            input = scanner.nextLine();
        }
    }

    private static Galaxy createGalaxy(Scanner scanner) {
        int[][] field = createField(scanner);

        Jedi jedi = new Jedi();
        Evil evil = new Evil();
        return new Galaxy(field, jedi, evil);
    }

    private static int[][] createField(Scanner scanner) {
        int[] size = parseIntArray(scanner.nextLine().split(" "));
        return IntStream.range(0, size[0])
                .mapToObj(line -> IntStream.range(line * size[1], line * size[1] + size[1]).toArray())
                .toArray(int[][]::new);
    }

    private static int[] parseIntArray(String[] numbers) {
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
    }
}
