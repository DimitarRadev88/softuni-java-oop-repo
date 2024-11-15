package com.reflectionAndAnnotations.exercise.barracksWars.interfaces;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	boolean containsUnit(String unitType);

	void removeUnit(String unitType);
}
