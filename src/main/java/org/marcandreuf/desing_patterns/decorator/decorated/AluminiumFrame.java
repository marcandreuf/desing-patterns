package org.marcandreuf.desing_patterns.decorator.decorated;

import org.marcandreuf.desing_patterns.decorator.Decoration;
import org.marcandreuf.desing_patterns.decorator.Window;

public class AluminiumFrame extends Decoration {

    public AluminiumFrame(Window window) {
        super(window);
    }

    @Override
    public String description() {
        return window.description() + " with aluminium frame";
    }



}
