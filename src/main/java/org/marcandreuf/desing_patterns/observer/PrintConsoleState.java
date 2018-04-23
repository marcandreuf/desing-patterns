package org.marcandreuf.desing_patterns.observer;

public class PrintConsoleState implements IObserver {

    private final ConcreteObservable observable;

    public PrintConsoleState(ConcreteObservable observable){
        observable.add(this);
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(observable.getState());
    }
}
