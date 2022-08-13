package org.desgin.staticProxy.inter;

public class AnniSinger implements Singer {
    private String name;

    public AnniSinger() {
    }

    public AnniSinger(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println(name + "在唱歌");
    }
}
