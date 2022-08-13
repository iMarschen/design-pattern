package org.desgin.staticProxy;

public class Client {
    public static void main(String[] args) {
        Singer anni = new Proxy("安妮");
        anni.sing();
    }
}
