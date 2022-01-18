package com.collection.test.LinkedListDemo;

/*
    LinkedList集合特有功能：
        public void addFirst(E e)：在列表开头插入指定元素；
        public void addLast(E e)：将指定元素追加到此列表末尾；
        public E getFirst()：返回此列表的第一个元素；
        public E getLast()：返回此列表的最后一个元素；
        public E removeFirst()：从列表中删除并返回第一个元素；
        public E removeLast()：从列表中删除并返回最后一个元素；
 */

import java.util.LinkedList;

public class LinkedListMethodDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("test");

//        public void addFirst(E e)：在列表开头插入指定元素；
//        public void addLast(E e)：将指定元素追加到此列表末尾；
//        linkedList.addFirst("java");
//        linkedList.addLast("java");

//        public E getFirst()：返回此列表的第一个元素；
//        public E getLast()：返回此列表的最后一个元素；
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());

//        public E removeFirst()：从列表中删除并返回第一个元素；
//        public E removeLast()：从列表中删除并返回最后一个元素；
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);
    }
}
