package org.marcandreuf.desing_patterns.command;

public class LightOnCmd implements ICommand {

    private final Light light;

    public LightOnCmd(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unexecute() {
        light.off();
    }
}
