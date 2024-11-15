package com.reflectionAndAnnotations.exercise.barracksWars.core.commands;

import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

public class RetireCommand extends Command {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        if (getRepository().containsUnit(getData()[1])) {
            getRepository().removeUnit(getData()[1]);
            return getData()[1] + " retired!";
        }
        return "No such units in repository.";
    }
}
