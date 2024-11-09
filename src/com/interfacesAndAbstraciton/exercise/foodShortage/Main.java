package com.interfacesAndAbstraciton.exercise.foodShortage;

import com.interfacesAndAbstraciton.exercise.foodShortage.entity.Citizen;
import com.interfacesAndAbstraciton.exercise.foodShortage.entity.Rebel;
import com.interfacesAndAbstraciton.exercise.foodShortage.entity.interfaces.Buyer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int buyers = Integer.parseInt(reader.readLine());

        if (buyers <= 0) {
            System.out.println(0);
            return;
        }

        Map<String, Buyer> buyersByNameMap = new HashMap<>();
        for (int i = 0; i < buyers; i++) {
            String[] info = reader.readLine().split(" ");
            buyersByNameMap.put(info[0], parseBuyer(info));
        }

        if (buyersByNameMap.isEmpty()) {
            System.out.println(0);
            return;
        }

        String name = reader.readLine();

        while (!"End".equals(name)) {
            if (buyersByNameMap.containsKey(name)) {
                buyersByNameMap.get(name).buyFood();
            }
            name = reader.readLine();
        }

        System.out.println(buyersByNameMap.values().stream().mapToInt(Buyer::getFood).sum());
    }

    private static Buyer parseBuyer(String[] info) {
        if (info.length == 4) {
            return new Citizen(info[0], Integer.parseInt(info[1]), info[2], info[3]);
        } else if (info.length == 3) {
            return new Rebel(info[0], Integer.parseInt(info[1]), info[2]);
        }

        throw new IllegalArgumentException("Unknown buyer type");
    }
}
