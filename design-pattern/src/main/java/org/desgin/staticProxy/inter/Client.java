package org.desgin.staticProxy.inter;

public class Client {
    public static void main(String[] args) {
        Proxy anni = new Proxy(new AnniSinger("anni"));
        anni.sing();
        AnniSinger tt = new AnniSinger("tt");
        tt.sing();
    }
}
