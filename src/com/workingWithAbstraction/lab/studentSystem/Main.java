package com.workingWithAbstraction.lab.studentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        String[] input = scanner.nextLine().split(" ");

        while (!"Exit".equals(input[0])) {
            studentSystem.ParseCommand(input);

            input = scanner.nextLine().split(" ");
        }
    }
}
