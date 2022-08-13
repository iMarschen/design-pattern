package org.desgin.template;

public class StarPrisoner extends Prisoner {

    public StarPrisoner() {
    }

    public StarPrisoner(String name) {
        this.name = name;
    }

    @Override
    void work() {
        System.out.println(this.name + ":边吃边唱");
    }

    @Override
    void eat() {
        System.out.println(this.name+":在思考人生");
    }

    @Override
    void readNews() {
        System.out.println(this.name+":看CCTV");
    }
}
