package org.desgin.dynamicProxy.cglib;

import org.desgin.dynamicProxy.jdk.Singer;

public class AnniSinger {
    private String name;

    public AnniSinger() {
    }

    public AnniSinger(String name) {
        this.name = name;
    }

    public void sing() {
        System.out.println(name + "在唱歌");
    }

}
