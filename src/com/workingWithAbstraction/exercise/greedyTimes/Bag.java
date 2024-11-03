package com.workingWithAbstraction.exercise.greedyTimes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private Map<String, LinkedHashMap<String, Long>> bag;
    private long capacity;
    private long itemsCount;

    public Bag(long capacity) {
        this.bag = new LinkedHashMap<>();
        this.capacity = capacity;
        this.itemsCount = 0;
    }

    public long getGoldValue() {
        if (bag.containsKey("Gold")) {
            return getSumOfValues(bag.get("Gold"));
        }
        return 0L;
    }

    public long getGemValue() {
        if (bag.containsKey("Gem")) {
            return getSumOfValues(bag.get("Gem"));
        }
        return 0L;
    }

    public long getCashValue() {
        if (bag.containsKey("Cash")) {
            return getSumOfValues(bag.get("Cash"));
        }
        return 0L;
    }

    public void add(String name, long count) {
        if (count + itemsCount > capacity) {
            return;
        }

        String type = getItemType(name);
        if (type != null) {
            switch (type) {
                case "Cash" -> addCash(name, count);
                case "Gem" -> addGem(name, count);
                case "Gold" -> addGold(name, count);
            }
        }
    }

    private static String getItemType(String name) {
        if (name.length() == 3) {
            return "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            return "Gem";
        } else if (name.equalsIgnoreCase("gold")) {
            return "Gold";
        }
        return null;
    }

    public void addCash(String name, long count) {
        if (canAddCashAmount(count)) {
            bag.putIfAbsent("Cash", new LinkedHashMap<>());
            Map<String, Long> cash = bag.get("Cash");
            cash.putIfAbsent(name, 0L);
            bag.get("Cash").put(name, cash.get(name) + count);
            itemsCount += count;
        }
    }

    private boolean canAddCashAmount(long count) {
        return getGemValue() >= getCashValue() + count;
    }

    public void addGem(String name, long count) {
        if (canAddGemAmount(count)) {
            bag.putIfAbsent("Gem", new LinkedHashMap<>());
            Map<String, Long> gem = bag.get("Gem");
            gem.putIfAbsent(name, 0L);
            gem.put(name, gem.get(name) + count);
            itemsCount += count;
        }
    }

    private boolean canAddGemAmount(long count) {
        return getGoldValue() >= getGemValue() + count;
    }

    public void addGold(String name, long count) {
        bag.putIfAbsent("Gold", new LinkedHashMap<>());
        Map<String, Long> gold = bag.get("Gold");
        gold.putIfAbsent(name, 0L);
        gold.put(name, gold.get(name) + count);
        itemsCount += count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        bag.entrySet().stream()
                .sorted((f, s) -> Long.compare(getSumOfValues(s.getValue()), getSumOfValues(f.getValue())))
                .forEach(e -> {
                    sb.append(String.format("<%s> $%d", e.getKey(), getSumOfValues(e.getValue())));
                    sb.append(System.lineSeparator());
                    e.getValue().entrySet()
                            .stream()
                            .sorted((f, s) -> f.getValue().compareTo(s.getValue()))
                            .sorted((f, s) -> s.getKey().compareTo(f.getKey()))
                            .forEach(entry -> {
                                sb.append(String.format("##%s - %d", entry.getKey(), entry.getValue()));
                                sb.append(System.lineSeparator());
                            });
                });

        return sb.toString().trim();
    }

    private static long getSumOfValues(Map<String, Long> map) {
        return map.values().stream().mapToLong(n -> n).sum();
    }
}
