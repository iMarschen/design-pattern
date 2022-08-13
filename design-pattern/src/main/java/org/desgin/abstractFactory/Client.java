package org.desgin.abstractFactory;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        AbstractPC abstractPC = factory.producePc();
        abstractPC.playGame();
    }
}
