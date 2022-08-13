package org.desgin.template;

public class Visitor {
    public void visit(Prisoner p){
        System.out.println("--------开始体验"+p.name+"的一天---------");
        p.oneLife();
        System.out.println("---------------体验结束---------------");
    }

    public static void main(String[] args) {
        new Visitor().visit(new StarPrisoner("wuyifan"));
        new Visitor().visit(new PoliticalPrisoner("zhangsan"));
    }
}
