package com.collection.test.TreeSetDemo;

/*
    TreeSet集合特点：
        1 元素有序（不是指存储或取出的顺序），而是按照一定的规则进行排序，具体排序方式取决于构造方法
            TreeSet()，根据其元素的自然排序进行排序
            TreeSet(Comparator comparator),根据指定的比较器进行排序
        2 没有带索引的方法，所以不能使用普通for循环进行遍历
        3 由于是Set集合，所以不包含重复元素的集合
 */

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

//        ts.add(30);不包含重复元素

        //遍历集合
        for (Integer i : ts) {
            System.out.println(i);
        }

    }
}
