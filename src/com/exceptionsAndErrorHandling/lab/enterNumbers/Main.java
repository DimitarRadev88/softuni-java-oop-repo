package com.exceptionsAndErrorHandling.lab.enterNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    private static final int[] NUMBERS_RANGE = {1, 100};
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = readNumber(reader);
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println(Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining(", ")));


    }

    private static int readNumber(BufferedReader reader) throws IOException {
        int number;
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (RuntimeException e) {
            throw new InvalidNumberException("Invalid Number!");
        }

        try {
            changeStartingRange(number);
        } catch (NumberNotInRangeException e) {
            throw new InvalidNumberException(e.getMessage());
        }

        return number;
    }

    private static void changeStartingRange(int number) {
        if (number > NUMBERS_RANGE[0] && number < NUMBERS_RANGE[1]) {
            NUMBERS_RANGE[0] = number;
        } else {
            throw new NumberNotInRangeException(String.format("Your number is not in range %d - %d!",
                    NUMBERS_RANGE[0], NUMBERS_RANGE[1]));
        }
    }

    private static boolean isInRange(int number) {
        return number > NUMBERS_RANGE[0] && number < NUMBERS_RANGE[1];
    }

    private static class InvalidNumberException extends RuntimeException {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    private static class NumberNotInRangeException extends RuntimeException {
        public NumberNotInRangeException(String message) {
            super(message);
        }
    }
}
