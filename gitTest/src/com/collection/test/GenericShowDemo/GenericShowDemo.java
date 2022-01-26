package com.collection.test.GenericShowDemo;

public class GenericShowDemo {
    public static void main(String[] args) {
        /*
        Generic g = new Generic();
        g.show("张三");
        g.show(30);
        g.show(true);
        */

        /*泛型类测试
        Generic<String> g1 = new Generic<>();
        g1.show("张三");

        Generic<Integer> g2 = new Generic<>();
        g2.show(30);

        Generic<Boolean> g3 = new Generic<>();
        g3.show(true);
        */

        //泛型方法测试
        Generic gg = new Generic();
        gg.show("张三");
        gg.show(30);
        gg.show(12.34);
    }
}
