package org.marcandreuf.desing_patterns.abstract_factory;

import org.marcandreuf.desing_patterns.abstract_factory.components.AlertComponent;
import org.marcandreuf.desing_patterns.abstract_factory.components.ButtonComponent;

public interface GraphicsFactory {

    AlertComponent getAlertComp();
    ButtonComponent getButtonComp();

}
