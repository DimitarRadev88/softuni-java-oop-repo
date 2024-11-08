package com.interfacesAndAbstraciton.borderControl;

import com.interfacesAndAbstraciton.borderControl.identifiable.Citizen;
import com.interfacesAndAbstraciton.borderControl.identifiable.Identifiable;
import com.interfacesAndAbstraciton.borderControl.identifiable.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        Map<String, Identifiable> identifiableMap = new LinkedHashMap<>();

        while (!"End".equals(input)) {
            String[] info = input.split(" ");

            if (info.length == 2) {
                identifiableMap.put(info[1], new Robot(info[0], info[1]));
            } else if (info.length == 3) {
                identifiableMap.put(info[2], new Citizen(info[0], Integer.parseInt(info[1]), info[2]));
            }

            input = reader.readLine();
        }

        if (identifiableMap.isEmpty()) {
            return;
        }
        String fakeIdEnd = reader.readLine();

        printDetainedIdentifiable(identifiableMap, fakeIdEnd);
    }

    private static void printDetainedIdentifiable(Map<String, Identifiable> map, String fakeIdEnd) {
        map.keySet().stream().filter(k -> k.endsWith(fakeIdEnd)).forEach(System.out::println);
    }
}
