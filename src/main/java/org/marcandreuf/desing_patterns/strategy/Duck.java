package org.marcandreuf.desing_patterns.strategy;

public class Duck {


    private IDisplayBehaviour displayBehaviour;
    private IQuackBehaviour quackBehaviour;
    private IFlyBehaviour flyBehaviour;


    public Duck(IDisplayBehaviour displayBehaviour,
                IQuackBehaviour quackBehaviour,
                IFlyBehaviour flyBehaviour){
        this.displayBehaviour = displayBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.flyBehaviour = flyBehaviour;
    }

    public void display(){
        displayBehaviour.display();
    }

    public void quack(){
        quackBehaviour.quack();
    }

    public void fly(){
        flyBehaviour.fly();
    }

}
