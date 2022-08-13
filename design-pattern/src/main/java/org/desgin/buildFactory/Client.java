package org.desgin.buildFactory;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder().buildMemoryBank("七彩虹")
                .buildCpu("intel")
                .buildMouse("samsung")
                .buildMouse("logitech").build();
        System.out.println(computer);
    }
}
