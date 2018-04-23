package org.marcandreuf.design_patterns.decorator;

import org.junit.Test;
import org.marcandreuf.desing_patterns.decorator.SimpleWindow;
import org.marcandreuf.desing_patterns.decorator.Window;
import org.marcandreuf.desing_patterns.decorator.decorated.AluminiumFrame;
import org.marcandreuf.desing_patterns.decorator.decorated.SingleGlass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class DecorationTest {

    private Logger logger = LoggerFactory.getLogger(DecorationTest.class);

    @Test
    public void shouldBeASingleWindowWithAluminiumFrame() throws Exception {

        Window window = new SimpleWindow().with(AluminiumFrame.class).with(SingleGlass.class);

        logger.debug(window.description());
        assertThat(window.description())
                .containsIgnoringCase("single")
                .containsIgnoringCase("aluminium")
                .containsIgnoringCase("window");
    }
}
