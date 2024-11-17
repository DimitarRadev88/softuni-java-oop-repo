package com.designPatterns.lab.facade2.command;

import java.util.ArrayList;
import java.util.List;

public class PriceModifier {
    private final List<Command> commands;
    private Command command;

    public PriceModifier() {
        this.commands = new ArrayList<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String invoke() {
        commands.add(command);
        return command.executeAction();
    }

}
