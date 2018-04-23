package org.marcandreuf.design_patterns.command;

import org.marcandreuf.desing_patterns.command.ICommand;
import org.marcandreuf.desing_patterns.command.Light;

public class LightDownCmd implements ICommand {
    private final Light light;

    public LightDownCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.down();
    }

    @Override
    public void unexecute() {
        light.up();
    }
}
