package org.marcandreuf.desing_patterns.abstract_factory;

import org.marcandreuf.desing_patterns.abstract_factory.components.AlertCompMacOs;
import org.marcandreuf.desing_patterns.abstract_factory.components.AlertComponent;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonCompMacOs;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonComponent;

public class GraphicsFactMacOs implements GraphicsFactory {
    @Override
    public AlertComponent getAlertComp() {
        return new AlertCompMacOs();
    }

    @Override
    public ButtonComponent getButtonComp() {
        return new ButtonCompMacOs();
    }
}
