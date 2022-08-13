package org.desgin.template;

//犯人的公共行为
public abstract class Prisoner {
    protected String name;
    abstract void work();
    abstract void eat();
    abstract void readNews();

    public void oneLife(){
        eat();
        work();
        eat();
        work();
        readNews();
    }
}
