package org.desgin.staticProxy.inter;

public class Proxy implements Singer{

    private Singer singer;

    public Proxy(Singer singer) {
        this.singer = singer;
    }

    @Override
    public void sing() {
        System.out.println("qian");
        singer.sing();
        System.out.println("hou");
    }
}
