package org.marcandreuf.desing_patterns.abstract_factory;

import org.marcandreuf.desing_patterns.abstract_factory.components.AlertCompLinux;
import org.marcandreuf.desing_patterns.abstract_factory.components.AlertComponent;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonCompLinux;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonComponent;

public class GraphicsFactLinux implements GraphicsFactory {
    @Override
    public AlertComponent getAlertComp() {
        return new AlertCompLinux();
    }

    @Override
    public ButtonComponent getButtonComp() {
        return new ButtonCompLinux();
    }
}
