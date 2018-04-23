package org.marcandreuf.desing_patterns.decorator;

import java.lang.reflect.Constructor;

public abstract class Window {

    public Window with(Class<? extends Decoration> decoration) throws Exception {
        Constructor constructor = decoration.getConstructor(Window.class);
        return (Window) constructor.newInstance(this);
    }

    public abstract String description();
}
