package com.collection.test.SetDemo;

/*
    Set集合特点：
        不包含重复元素的集合
        没有带索引的方法，所以不能用普通for循环遍历

    HashSet对集合的迭代顺序不做任何保证
 */

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        //创建集合对象（Set是接口，不能直接实例化）
        Set<String> set = new HashSet<>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("test");
//        set.add("world");不包含重复元素的集合

        //遍历
        for(String s : set){
            System.out.println(s);
        }
    }
}
