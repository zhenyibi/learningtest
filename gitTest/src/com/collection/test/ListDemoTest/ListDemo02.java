package com.collection.test.ListDemoTest;

import java.util.ArrayList;
import java.util.List;

/*
    List特有方法
        void add(int index,E element):指定位置插入指定元素
        E remove(int index):删除指定索引处的元素，返回被删除的元素
        E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        E get(int index):返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加集合元素
        list.add("hello");
        list.add("world");
        list.add("test");

        //void add(int index,E element):指定位置插入指定元素
        list.add(1,"java");
        //IndexOutOfBoundsException
//        list.add(11,"javaee");

        //E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));
        //IndexOutOfBoundsException
//        System.out.println(list.remove(11));

        //E set(int index,E element):修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1,"javaee"));
        //IndexOutOfBoundsException
//        System.out.println(list.set(11,"javaee"));

        //E get(int index):返回指定索引处的元素
        System.out.println(list.get(1));
        //IndexOutOfBoundsException
//        System.out.println(list.get(11));

        //输出集合对象
        System.out.println(list);

        //集合长度
        System.out.println(list.size());

        //遍历集合
        for(String s : list){
            System.out.println(s);
        }
    }
}
