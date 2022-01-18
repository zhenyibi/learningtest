package com.collection.test.LinkedListDemo;

/*
    List集合常用子类：ArrayList，LinkedList
        ArrayList：底层是数组，查询快，增删慢
        LinkedList：底层是链表，查询慢，增删快
 */

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linedList = new LinkedList<>();
        linedList.add("hello");
        linedList.add("world");
        linedList.add("test");

        for (String s : linedList) {
            System.out.println(s);
        }
    }
}
