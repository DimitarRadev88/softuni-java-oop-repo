package com.reflectionAndAnnotations.exercise.barracksWars.core.factories;


import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Unit;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "com.reflectionAndAnnotations.exercise.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) {
        Class<?> unitClass;

        try {
            unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Unit unit;
        try {
            unit = (Unit) unitClass.getDeclaredConstructors()[0].newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        return unit;
    }

}
