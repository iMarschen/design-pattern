package org.desgin.staticProxy;

public class Singer {
    private String name;

    public String getName() {
        return name;
    }

    public void sing() {
        System.out.println(name + "在唱歌");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Singer() {
    }

    public Singer(String name) {
        this.name = name;
    }
}
