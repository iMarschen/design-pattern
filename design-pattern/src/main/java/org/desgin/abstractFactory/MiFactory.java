package org.desgin.abstractFactory;

public class MiFactory extends AbstractFactory{
    @Override
    AbstractPhone producePhone() {
        return new Mi12();
    }

    @Override
    AbstractPC producePc() {
        return new MiBook();
    }
}
