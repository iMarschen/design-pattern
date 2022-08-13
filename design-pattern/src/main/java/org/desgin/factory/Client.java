package org.desgin.factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Iphone13Factory();
        Phone product = factory.product();
        product.call();
        Factory factory1 = new SamsungS22Factory();
        Phone product1 = factory1.product();
        product1.call();
    }
}
