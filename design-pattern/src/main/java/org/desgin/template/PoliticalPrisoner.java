package org.desgin.template;

public class PoliticalPrisoner extends Prisoner{
    public PoliticalPrisoner(String name) {
        this.name = name;
    }

    @Override
    void work() {
        System.out.println("zz犯在交代");
    }

    @Override
    void eat() {
        System.out.println("zz犯人在吃饭");
    }

    @Override
    void readNews() {
        System.out.println("zz犯被洗脑");
    }
}
