package org.marcandreuf.design_patterns.command;

import org.marcandreuf.desing_patterns.command.ICommand;
import org.marcandreuf.desing_patterns.command.Light;

public class LightOffCmd implements ICommand {

    private final Light light;

    public LightOffCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unexecute() {
        light.on();
    }
}
