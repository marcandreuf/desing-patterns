package org.marcandreuf.desing_patterns.command;

public interface ICommand {
    void execute();
    void unexecute();
}
