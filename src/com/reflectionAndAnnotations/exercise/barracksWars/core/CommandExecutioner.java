package com.reflectionAndAnnotations.exercise.barracksWars.core;

import com.reflectionAndAnnotations.exercise.barracksWars.core.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutioner {
    private final List<Command> commandList = new ArrayList<>();

    public String executeCommand(Command command) {
        commandList.add(command);
        return command.execute();
    }
}
