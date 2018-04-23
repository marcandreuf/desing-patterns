package org.marcandreuf.desing_patterns.strategy;

import java.util.List;

public class CountrySide {

    private List<Duck> ducks;

    public CountrySide(){
        populateDucks();
    }

    private void populateDucks() {
        Duck rubber_duck = new Duck(new TextDisplaying(), new NoQuacking(), new NoFlying());
        ducks.add(rubber_duck);

        Duck wild_duck = new Duck(new ImageDisplaying(), new SimpleQuacking(), new SimpleFlying());
        ducks.add(wild_duck);
    }

    public void render(){
        //Call renderer and pass ducks list.
    }
}
