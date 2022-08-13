package org.desgin.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Singer anni = new AnniSinger("anni");

        Singer proxy = (Singer) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Singer.class}, (proxy1, method, args1) -> {
                    System.out.println("++++++++");
                    method.invoke(anni);
                    System.out.println("---------");
                    return null;
                });
        proxy.sing();
    }
}
