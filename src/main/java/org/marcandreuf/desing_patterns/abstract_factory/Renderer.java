package org.marcandreuf.desing_patterns.abstract_factory;

import org.marcandreuf.desing_patterns.abstract_factory.components.AlertComponent;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonComponent;

/*
This class represents the client of an Abstract factory
 */
public class Renderer {

    GraphicsFactory graphicsFactory;

    public Renderer(GraphicsFactory graphicsFactory){
        this.graphicsFactory = graphicsFactory;
    }


    public AlertComponent getAlert() {
        return graphicsFactory.getAlertComp();
    }

    public ButtonComponent getButton(){
        return graphicsFactory.getButtonComp();
    }

}
