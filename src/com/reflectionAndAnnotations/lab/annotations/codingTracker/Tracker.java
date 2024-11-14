package com.reflectionAndAnnotations.lab.annotations.codingTracker;

import java.util.Arrays;

public class Tracker {
    @Author(name = "George")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Peter")
    public static void printMethodsByAuthor(Class<?> myClass) {
        Arrays.stream(myClass.getDeclaredMethods()).filter(m -> m.isAnnotationPresent(Author.class)).forEach(m -> {
            System.out.printf("%s: %s()%n", m.getAnnotation(Author.class).name(), m.getName());
        });
    }
}
