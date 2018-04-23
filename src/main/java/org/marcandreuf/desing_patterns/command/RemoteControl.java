package org.marcandreuf.desing_patterns.command;

public class RemoteControl {

    ICommand onCommand;
    ICommand offCommand;
    ICommand upCommand;
    ICommand downCommand;

    public RemoteControl(ICommand onCommand, ICommand offCommand, ICommand upCommand, ICommand downCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    public void On() {
        this.onCommand.execute();
    }


    public void Off() {
        this.offCommand.execute();
    }

    public void Up() {
        this.upCommand.execute();
    }

    public void Down() {
        this.downCommand.execute();
    }
}
