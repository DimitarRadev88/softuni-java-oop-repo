package com.reflectionAndAnnotations.exercise.barracksWars.core.commands;

import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Executable;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }

    protected String[] getData() {
        return data;
    }

}
