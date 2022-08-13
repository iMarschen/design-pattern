package org.desgin.dynamicProxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\class");
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(AnniSinger.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("---------");
                Object invoke = methodProxy.invokeSuper(o,objects);
                System.out.println("++++++++++");
                return invoke;
            }
        });
        AnniSinger anniSinger = (AnniSinger) enhancer.create();
        anniSinger.sing();
    }
}
