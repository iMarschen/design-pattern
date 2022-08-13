package org.desgin.abstractFactory;

public class AppleFactory extends AbstractFactory{
    @Override
    AbstractPhone producePhone() {
        return new Iphone12();
    }

    @Override
    AbstractPC producePc() {
        return new MacBook();
    }
}
