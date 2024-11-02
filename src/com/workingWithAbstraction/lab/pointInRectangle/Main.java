package com.workingWithAbstraction.lab.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Rectangle rectangle = new Rectangle(
                new Point(coordinates[0], coordinates[1]),
                new Point(coordinates[2], coordinates[3])
        );

        printRectangleContainsInputPoint(scanner, rectangle);
    }

    private static void printRectangleContainsInputPoint(Scanner scanner, Rectangle rectangle) {
        IntStream.range(0, Integer.parseInt(scanner.nextLine())).forEach(l -> {
            int[] pointCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(rectangle.contains(new Point(pointCoordinates[0], pointCoordinates[1])));
        });
    }
}
