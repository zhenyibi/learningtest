package com.collection.test.ListDemoTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List集合特点
        有序：存储和去除的元素顺序一致
        可重复：存储的元素可重复
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加集合元素
        list.add("hello");
        list.add("world");
        list.add("test");
        list.add("world");

        //输出集合对象
        System.out.println(list);

        //遍历集合（迭代器）
        Iterator<String> it = list.iterator();
        for(String s : list){
            System.out.println(s);
        }

    }
}
