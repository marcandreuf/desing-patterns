package org.marcandreuf.desing_patterns.decorator;

public abstract class Decoration extends Window {

    protected final Window window;

    public Decoration(Window window){
        this.window = window;
    }

    public Decoration(){
        window = new SimpleWindow();
    }



}
