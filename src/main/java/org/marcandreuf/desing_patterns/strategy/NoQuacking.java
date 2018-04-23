package org.marcandreuf.desing_patterns.strategy;

public class NoQuacking implements IQuackBehaviour {
    @Override
    public void quack() {
        //does not quack
    }
}
