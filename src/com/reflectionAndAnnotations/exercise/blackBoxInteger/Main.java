package com.reflectionAndAnnotations.exercise.blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    private static BlackBoxInt BLACK_BOX_INT;
    private static Method[] METHODS;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Class<?> myClass = BlackBoxInt.class;
        BLACK_BOX_INT = (BlackBoxInt) createObject(myClass);
        METHODS = BLACK_BOX_INT.getClass().getDeclaredMethods();
        Field innerValue = getAccessibleField("innerValue");

        String input = reader.readLine();

        while (!"END".equals(input)) {
            String[] command = input.split("_");
            parseCommand(command);
            printFieldValue(innerValue);

            input = reader.readLine();
        }

    }

    private static Field getAccessibleField(String fieldName) {
        try {
            Field field = BLACK_BOX_INT.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printFieldValue(Field field) {
        try {
            System.out.println(field.getInt(BLACK_BOX_INT));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void parseCommand(String[] command) {
        Method method = getMethodByName(command[0]);

        method.setAccessible(true);
        try {
            method.invoke(BLACK_BOX_INT, Integer.parseInt(command[1]));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }

    private static Method getMethodByName(String name) {
        return Arrays.stream(METHODS)
                .filter(method -> method.getName().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    private static Object createObject(Class<?> myClass) {
        BlackBoxInt blackBoxInt;
        Constructor<?> ctor = Arrays
                .stream(myClass.getDeclaredConstructors())
                .filter(c -> c.getParameterCount() == 0)
                .findAny().orElse(null);
        if (ctor != null) {
            ctor.setAccessible(true);

            try {
                return ctor.newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        throw new IllegalArgumentException();
    }
}
