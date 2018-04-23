package org.marcandreuf.desing_patterns.factory;

public class ConcreteFactory implements IFactory {
    @Override
    public IProduct factoryMethod() {
        return new ConcreteProduct();
    }
}
