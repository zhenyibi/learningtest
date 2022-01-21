package com.collection.test.HashDemo;

/*
    LinkedHashSet集合特点
        1 哈希表和链表实现的Set接口，具有可预测的迭代次序
        2 由链表表征元素有序，即元素的存储和取出顺序是一致的
        3 由哈希表保证元素的唯一性，即没有重复的元素
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //添加元素
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("test");

//        linkedHashSet.add("world");

        //遍历
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
