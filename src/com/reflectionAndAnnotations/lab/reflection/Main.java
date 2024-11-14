package com.reflectionAndAnnotations.lab.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        reflection();
//        gettersAndSetters();
        highQualityMistakes();
    }

    private static void highQualityMistakes() {
        Class<?> reflection = Reflection.class;

        checkFieldModifiers(reflection);

        Method[] methods = Arrays
                .stream(reflection.getDeclaredMethods())
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);

        checkGetterModifiers(methods);
        checkSetterModifiers(methods);

    }

    private static void checkSetterModifiers(Method[] methods) {
        Method[] setters = filterMethodsStartingWith(methods, "set");

        for (Method setter : setters) {
            int modifiers = setter.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.printf("%s have to be private!%n", setter.getName());
            }
        }
    }

    private static void checkGetterModifiers(Method[] methods) {
        Method[] getters = filterMethodsStartingWith(methods, "get");

        for (Method getter : getters) {
            int modifiers = getter.getModifiers();
            if (!Modifier.isPublic(modifiers)) {
                System.out.printf("%s have to be public!%n", getter.getName());
            }
        }
    }

    private static void checkFieldModifiers(Class<?> reflection) {
        Field[] fields = Arrays.stream(reflection.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .toArray(Field[]::new);

        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (!Modifier.isPrivate(modifiers)) {
                System.out.printf("%s must be private!%n", field.getName());
            }
        }
    }

    private static void gettersAndSetters() {
        Class<?> reflection = Reflection.class;

        Method[] methods = Arrays.stream(reflection.getDeclaredMethods())
                .sorted(Comparator.comparing(Method::getName))
                .toArray(Method[]::new);
        Method[] setters = filterMethodsStartingWith(methods, "set");
        Method[] getters = filterMethodsStartingWith(methods, "get");

        printGetters(getters);
        printSetters(setters);

    }

    private static void printSetters(Method[] setters) {
        for (Method setter : setters) {
            System.out.printf("%s and will set field of class %s%n", setter.getName(), setter.getParameterTypes()[0].getName());
        }
    }

    private static void printGetters(Method[] getters) {
        for (Method getter : getters) {
            System.out.printf("%s will return class %s%n", getter.getName(), getter.getReturnType().getName());
        }
    }

    private static Method[] filterMethodsStartingWith(Method[] methods, String text) {
        return Arrays.stream(methods)
                .filter(method -> method.getName().startsWith(text))
                .toArray(Method[]::new);
    }

    private static void reflection() {
        Class<?> reflection = Reflection.class;
        System.out.println(reflection);

        Class<?> superClass = reflection.getSuperclass();
        System.out.println(superClass);

        Class<?>[] interfaces = reflection.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Object reflectionObject;
        try {
            reflectionObject = reflection.getDeclaredConstructor().newInstance();
        } catch (
                InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchMethodException e
        ) {
            throw new RuntimeException(e);
        }

        System.out.println(reflectionObject);
    }
}
