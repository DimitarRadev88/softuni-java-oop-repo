package com.encapsulation.exercise.classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Integer.parseInt(reader.readLine());
        double width = Integer.parseInt(reader.readLine());
        double height = Integer.parseInt(reader.readLine());

        try {
            System.out.println(new Box(length, width, height));
        } catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
}
