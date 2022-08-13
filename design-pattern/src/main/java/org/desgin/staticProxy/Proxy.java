package org.desgin.staticProxy;

public class Proxy extends Singer{
    @Override
    public void sing() {
        System.out.println("proxy布置场地");
        super.sing();
        System.out.println("proxy收拾现场");
    }

    public Proxy() {
    }

    public Proxy(String name) {
        super(name);
    }
}
