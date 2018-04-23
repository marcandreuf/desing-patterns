package org.marcandreuf.design_patterns.command;

import org.marcandreuf.desing_patterns.command.ICommand;
import org.marcandreuf.desing_patterns.command.Light;

public class LightUpCmd implements ICommand {
    private final Light light;

    public LightUpCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.up();
    }

    @Override
    public void unexecute() {
        light.down();
    }
}
