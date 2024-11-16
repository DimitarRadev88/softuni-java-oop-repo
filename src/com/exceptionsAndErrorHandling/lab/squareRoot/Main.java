package com.exceptionsAndErrorHandling.lab.squareRoot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.printf("%.2f%n", getSquareRoot(reader.readLine()));
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Goodbye");
        }

    }

    private static double getSquareRoot(String s) {
        try {
            int number = Integer.parseInt(s);
            if (number < 0) {
                throw new InvalidNumberException("Invalid");
            }
            return Math.sqrt(number);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid");
        }
    }

    private static class InvalidNumberException extends RuntimeException {
        public InvalidNumberException(String message) {
            super(message);
        }
    }
}
