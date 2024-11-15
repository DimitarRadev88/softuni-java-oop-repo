package com.reflectionAndAnnotations.exercise.harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();

		Class<?> richSoilLand = RichSoilLand.class;
		Field[] fields = richSoilLand.getDeclaredFields();

		while (!"HARVEST".equals(input)) {
			printFieldsWithAccessModifier(fields, input);

			input = reader.readLine();
		}
	}

	private static void printFieldsWithAccessModifier(Field[] fields, String accessModifier) {
		Field[] filtered = switch (accessModifier) {
			case "private" -> filterFieldsByModifier(fields, f -> Modifier.isPrivate(f.getModifiers()));
			case "protected" -> filterFieldsByModifier(fields, f -> Modifier.isProtected(f.getModifiers()));
			case "public" -> filterFieldsByModifier(fields, f -> Modifier.isPublic(f.getModifiers()));
			case "all" -> filterFieldsByModifier(fields, f -> true);
			default -> throw new UnsupportedOperationException("Invalid command!");
		};

		Arrays.stream(filtered).forEach(f -> System.out.printf("%s %s %s%n",
				Modifier.toString(f.getModifiers()),
				f.getType().getSimpleName(),
				f.getName())
		);
	}

	private static Field[] filterFieldsByModifier(Field[] fields, Predicate<Field> predicate) {
		return Arrays.stream(fields).filter(predicate).toArray(Field[]::new);
	}


}

