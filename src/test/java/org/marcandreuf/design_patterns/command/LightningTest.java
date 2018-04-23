package org.marcandreuf.design_patterns.command;

import org.junit.Before;
import org.junit.Test;
import org.marcandreuf.desing_patterns.command.Light;
import org.marcandreuf.desing_patterns.command.LightOnCmd;
import org.marcandreuf.desing_patterns.command.RemoteControl;

import static org.mockito.Mockito.verify;
import static org.powermock.api.mockito.PowerMockito.mock;

public class LightningTest {

    private Light light;
    private RemoteControl remoteControl;

    @Before
    public void setUp(){
        light = mock(Light.class);
        remoteControl = new RemoteControl(
                new LightOnCmd(light),
                new LightOffCmd(light),
                new LightUpCmd(light),
                new LightDownCmd(light));
    }


    @Test
    public void shouldTurnOnTheLight(){
        remoteControl.On();
        verify(light).on();
    }


    @Test
    public void shouldTurnOffTheLight(){
        remoteControl.Off();
        verify(light).off();
    }

    @Test
    public void shouldDimUpTheLight(){
        remoteControl.Up();
        verify(light).up();
    }

    @Test
    public void shouldDimDownTheLight(){
        remoteControl.Down();
        verify(light).down();
    }

}
