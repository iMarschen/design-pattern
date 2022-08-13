package org.desgin.dynamicProxy.jdk;

import org.desgin.factory.Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //JDK11,开启保存jdk动态代理生成的类
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        Singer proxy = (Singer) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{Singer.class},
                new MyHand(new AnniSinger("little anni")));//这个handler持有了一个被代理对象
        proxy.sing();
        System.out.println("=======================");
        main2();

    }

    private static void main2() throws ClassNotFoundException {
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        //只有全限定名称，怎么对其动态代理？
        String className = "org.desgin.factory.SamsungS22Factory";
        Class<?> aClass = Class.forName(className);
        Object proxyInstance = Proxy.newProxyInstance(
                aClass.getClassLoader(),
                aClass.getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("前面");
                    Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
                    method.invoke(declaredConstructor.newInstance());
                    System.out.println("后面");
                    return null;
                });
        Factory proxyInstance1 = (Factory) proxyInstance;
        proxyInstance1.product();
    }

    public static class MyHand implements InvocationHandler{
        private Singer singer;

        public MyHand(Singer singer) {
            this.singer = singer;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("前置工作");
            method.invoke(singer);
            System.out.println("后置工作");
            return null;
        }
    }
}
