package org.marcandreuf.design_patterns.factory;

import org.junit.Test;
import org.marcandreuf.desing_patterns.factory.ConcreteFactory;
import org.marcandreuf.desing_patterns.factory.IFactory;
import org.marcandreuf.desing_patterns.factory.IProduct;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    @Test
    public void shouldCreateAProduct(){
        IFactory factory = new ConcreteFactory();

        IProduct product = factory.factoryMethod();

        assertThat(product).isNotNull();

    }

}
