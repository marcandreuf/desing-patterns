package org.marcandreuf.design_patterns.abstract_factory;

import javafx.scene.control.Alert;
import org.junit.Test;
import org.marcandreuf.desing_patterns.abstract_factory.GraphicsFactLinux;
import org.marcandreuf.desing_patterns.abstract_factory.GraphicsFactMacOs;
import org.marcandreuf.desing_patterns.abstract_factory.Renderer;
import org.marcandreuf.desing_patterns.abstract_factory.components.*;

import static org.assertj.core.api.Assertions.assertThat;

public class RendererTest {

    private Renderer renderer;


    @Test
    public void shouldRenderLinuxUIComponents(){
        renderer = new Renderer(new GraphicsFactLinux());

        AlertComponent alert = renderer.getAlert();
        ButtonComponent button = renderer.getButton();


        assertThat(alert).isInstanceOf(AlertCompLinux.class);
        assertThat(button).isInstanceOf(ButtonCompLinux.class);
    }

    @Test
    public void shouldRenderMacOsUIComponents(){
        renderer = new Renderer(new GraphicsFactMacOs());

        AlertComponent alert = renderer.getAlert();
        ButtonComponent button = renderer.getButton();


        assertThat(alert).isInstanceOf(AlertCompMacOs.class);
        assertThat(button).isInstanceOf(ButtonCompMacOs.class);
    }







}
