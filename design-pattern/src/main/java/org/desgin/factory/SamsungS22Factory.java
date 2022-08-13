package org.desgin.factory;

public class SamsungS22Factory implements Factory{
    @Override
    public Phone product() {
        System.out.println("samsung is build");
        return new SamsungS22();
    }
}
