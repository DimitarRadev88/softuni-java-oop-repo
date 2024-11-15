package com.reflectionAndAnnotations.exercise.barracksWars.core.commands;

import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Unit;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

public class AddCommand extends Command {

    public AddCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = getData()[1];
        Unit unitToAdd = getUnitFactory().createUnit(unitType);
         getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }

}
