package com.reflectionAndAnnotations.exercise.barracksWars.core;

import com.reflectionAndAnnotations.exercise.barracksWars.core.commands.Command;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.Repository;
import com.reflectionAndAnnotations.exercise.barracksWars.interfaces.UnitFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Engine implements Runnable {
    private Repository repository;
    private UnitFactory unitFactory;
    private CommandExecutioner commandExecutioner;
    private CommandInitializer commandInitializer;

    public Engine(Repository repository, UnitFactory unitFactory, CommandExecutioner commandExecutioner, CommandInitializer commandInitializer) {
        this.repository = repository;
        this.unitFactory = unitFactory;
        this.commandExecutioner = commandExecutioner;
        this.commandInitializer = commandInitializer;
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                String input = reader.readLine();
                String[] data = input.split("\\s+");
                String commandName = data[0];
                String result = interpretCommand(data, commandName);
                if (result.equals("fight")) {
                    break;
                }
                System.out.println(result);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String interpretCommand(String[] data, String commandName) {
        Command command = commandInitializer.initialize(commandName, data, repository, unitFactory);

        return commandExecutioner.executeCommand(command);
    }



}
