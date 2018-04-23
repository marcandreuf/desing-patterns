package org.marcandreuf.desing_patterns.observer;

import java.util.List;

public class ConcreteObservable implements IObservable {

    private List<IObserver> observers;


    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update());
    }

    public String getState(){
        return "All fine";
    }
}
