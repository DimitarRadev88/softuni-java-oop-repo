package com.reflectionAndAnnotations.exercise.barracksWars.core;

import com.reflectionAndAnnotations.exercise.barracksWars.core.commands.Command;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CommandInitializer {
    private static final String PATH_TO_COMMANDS_PACKAGE =
            "com.reflectionAndAnnotations.exercise.barracksWars.core.commands.";

    public Command initialize(String name, String[] data, Repository repository, UnitFactory unitFactory) {
        Class<?> commandClass = null;
        try {
            commandClass = Class.forName(PATH_TO_COMMANDS_PACKAGE + getCommandClassName(name));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Constructor<?> ctor = null;
        try {
            ctor = commandClass.getDeclaredConstructor(String[].class, Repository.class, UnitFactory.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Command command = null;
        try {
            command = (Command) ctor.newInstance(data, repository, unitFactory);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return command;
    }

    private static String getCommandClassName(String commandName) {
        return commandName.toUpperCase().charAt(0) + commandName.substring(1) + "Command";
    }

}
