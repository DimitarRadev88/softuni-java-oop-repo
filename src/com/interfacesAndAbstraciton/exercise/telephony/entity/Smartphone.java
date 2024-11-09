package com.interfacesAndAbstraciton.exercise.telephony.entity;

import com.interfacesAndAbstraciton.exercise.telephony.entity.interfaces.Browsable;
import com.interfacesAndAbstraciton.exercise.telephony.entity.interfaces.Callable;

import java.io.BufferedReader;
import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        numbers.forEach(n -> {
            if (isValidNumber(n)) {
                sb.append(String.format("Calling... %s%n", n));
            } else {
                sb.append("Invalid number!").append(System.lineSeparator());;
            }
        });

        return sb.toString().trim();
    }

    private boolean isValidNumber(String n) {
        return n.replaceAll("\\d", "").isEmpty();
    }

    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        urls.forEach(url -> {
            if (isValidUrl(url)) {
                sb.append(String.format("Browsing: %s!%n", url));
            } else {
                sb.append("Invalid URL!").append(System.lineSeparator());
            }

        });

        return sb.toString().trim();
    }

    private boolean isValidUrl(String url) {
        return url.replaceAll("\\d", "").length() == url.length();
    }
}
