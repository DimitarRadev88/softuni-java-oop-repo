package com.exceptionsAndErrorHandling.lab.numberInRange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] range = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.printf("Range: [%d...%d]%n", range[0], range[1]);


        String input = reader.readLine();
        boolean isValid = false;
        while (!isValid) {
            try {
                isValid = isValid(input, range);
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
                input = reader.readLine();
            }
        }

        System.out.println("Valid number: " + input);
    }

    private static boolean isValid(String input, int[] range) {
        try {
            int number = Integer.parseInt(input);
            return isInRange(number, range);
        } catch (NumberFormatException | NumberNotInRangeException e) {
            throw new InvalidNumberException("Invalid number: " + input);
        }

    }

    private static boolean isInRange(int number, int[] range) {
        if (number < range[0] || number > range[1]) {
            throw new NumberNotInRangeException();
        }
        return true;
    }


    private static class InvalidNumberException extends RuntimeException {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    private static class NumberNotInRangeException extends RuntimeException {
    }
}
