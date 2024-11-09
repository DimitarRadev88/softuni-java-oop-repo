package com.interfacesAndAbstraciton.exercise.telephony;

import com.interfacesAndAbstraciton.exercise.telephony.entity.Smartphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] phones = reader.readLine().split(" ");
        String[] urls = reader.readLine().split(" ");

        Smartphone smartphone = new Smartphone(Arrays.asList(phones), Arrays.asList(urls));

        System.out.println(smartphone.call());

        System.out.println(smartphone.browse());

    }
}
