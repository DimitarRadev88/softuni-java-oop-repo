package com.reflectionAndAnnotations.exercise.barracksWars;


import com.reflectionAndAnnotations.exercise.barracksWars.core.CommandInitializer;
import com.reflectionAndAnnotations.exercise.barracksWars.core.Engine;
import com.reflectionAndAnnotations.exercise.barracksWars.core.CommandExecutioner;
import com.reflectionAndAnnotations.exercise.barracksWars.core.factories.UnitFactoryImpl;
import com.reflectionAndAnnotations.exercise.barracksWars.data.UnitRepository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandExecutioner commandExecutioner = new CommandExecutioner();
        CommandInitializer commandInitializer = new CommandInitializer();

        Runnable engine = new Engine(repository, unitFactory, commandExecutioner, commandInitializer);
        engine.run();
    }
}
