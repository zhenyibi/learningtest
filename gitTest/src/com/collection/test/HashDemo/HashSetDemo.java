package com.collection.test.HashDemo;

/*
    HashSet集合特点：
        1 底层数据结构是哈希表
        2 对集合的迭代顺序不作任何保证，即不保证存储和取出元素的顺序一致
        3 没有带索引的方法，所以不能使用普通for循环
        4 由于是Set集合，所以是不包含重复元素的集合
 */

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合元素
        HashSet<String> hs = new HashSet<>();

        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("test");

//        hs.add("world");

        //遍历
        for (String s : hs) {
            System.out.println(s);
        }
    }
}
