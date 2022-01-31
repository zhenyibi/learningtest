package com.collection.test.MapDemo;

/*
    Map集合概述
        Interface Map<K,V> K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
    创建Map集合的对象：
        多态的方式
        具体的实现类HashMap

 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();

        //V put (K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("it001","张三");
        map.put("it002","李四");
        map.put("it003","王五");
//        map.put("it003","赵六");

        //输出集合对象
        System.out.println(map);
    }
}
