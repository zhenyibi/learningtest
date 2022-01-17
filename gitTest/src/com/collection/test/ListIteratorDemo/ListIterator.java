package com.collection.test.ListIteratorDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * ListIterator列表迭代器
 *      通过List集合的ListIterator()方法得到，具有特殊性
 *      用于允许程序员沿任一方向遍历列表的列表迭代器，在迭代期间修改列表，并获取列表中的当前位置
 * ListIterator的常用方法
 *      E next() 返回迭代中的下一个元素
 *      boolean hasNext() 如果迭代具有更多元素，则返回true
 *      E previous() 返回列表的下一个元素
 *      boolean hasPrevious() 如果此列表在相反方向遍历列表时具有更多元素，则返回true
 *      void add(E e) 将指定的元素插入列表
 */
public class ListIterator {
    public static void main(String[] args) {
        //创建集合列表
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("test");

        //通过list集合的ListIterator方法得到
        java.util.ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");
        //逆向遍历
        while(lit.hasPrevious()){
            String s = lit.previous();
            System.out.println(s);
        }

        //创建列表迭代器
        java.util.ListIterator<String> lit2 = list.listIterator();
        while (lit2.hasNext()){
            String s = lit2.next();
            if (s.equals("world")){
                lit2.add("javaee");
            }
        }
        System.out.println(list);

    }
}
