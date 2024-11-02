package com.workingWithAbstraction.lab.rhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printRhombus(n);

    }

    private static void printRhombus(int n) {
        printTop(n);
        printBot(n);
    }

    private static void printBot(int n) {
        for (int i = n - 1; i > 0; i--) {
            printRow(n, i);
        }
    }

    private static void printTop(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
    }

    private static void printRow(int n, int i) {
        System.out.println(" ".repeat(n - i) + "* ".repeat(i));
    }

}
