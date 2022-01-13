package com.collection.test;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection集合常用方法
        boolean add(E e):添加元素
        boolean remove(Object o):移除元素
        void clear():清空集合中的元素
        boolean contains():判断集合中是否存在指定的元素
        boolean isEmpty():判断集合是否为空
        int size():集合的长度
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();

        //boolean add(E e):添加元素
//        System.out.println(c.add("hello"));
//        System.out.println(c.add("collection"));
//        System.out.println(c.add("collection"));
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o):移除元素
        System.out.println(c.remove("java"));
        System.out.println(c.remove("javaee"));

        //void clear():清空集合中的元素
//        c.clear();

        //boolean contains():判断集合中是否存在指定的元素
        System.out.println(c.contains("hello"));

        //boolean isEmpty():判断集合是否为空
        System.out.println(c.isEmpty());

        //int size():集合的长度
        System.out.println(c.size());

        //输出集合对象
        System.out.println(c);
    }
}
