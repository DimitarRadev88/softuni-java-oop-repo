package com.reflectionAndAnnotations.exercise.barracksWars.core.commands;

import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

public class ReportCommand extends Command {

    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        return getRepository().getStatistics();
    }

}
