package org.desgin.factory;

public class Iphone13Factory implements Factory{
    @Override
    public Phone product() {
        System.out.println("iphone13 is build");
        return new Iphone13();
    }
}
