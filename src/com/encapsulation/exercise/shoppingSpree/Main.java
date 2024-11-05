package com.encapsulation.exercise.shoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] peopleInfo = reader.readLine().split(";");
        for (String p : peopleInfo) {
            String[] personInfo = p.split("=");
            try {
                people.put(personInfo[0], new Person(personInfo[0], Double.parseDouble(personInfo[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productsInfo = reader.readLine().split(";");
        for (String p : productsInfo) {
            String[] productInfo = p.split("=");
            try {
                products.put(productInfo[0], new Product(productInfo[0], Double.parseDouble(productInfo[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = reader.readLine();

        while (!"END".equals(command)) {
            String[] personAndProduct = command.split(" ");

            try {
                people.get(personAndProduct[0]).buyProduct(products.get(personAndProduct[1]));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = reader.readLine();
        }

        people.values().forEach(System.out::println);
    }
}
