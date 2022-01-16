package com.collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("java");
        c.add("collection");

        //返回集合中元素的迭代器，通过集合的iterator()方法得到

        //E next():返回迭代器的下一个元素
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next()); //NoSuchElementException表示被请求的元素不存在 */

        //boolean hasNext():如果迭代具有更多元素，则返回true
        Iterator<String> it = c.iterator();
        /*
        遍历集合
        while(it.hasNext()){
            String s = it.next();
            System.out.println("s");
        }
         */
        for (String s : c) {
            System.out.println(s);
        }

    }
}
