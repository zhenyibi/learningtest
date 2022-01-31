package com.collection.test.MapDemo;

/*
    Map集合的基本功能
        V put(K key,V value) 添加元素
        V remove(Object key) 根据键删除键值元素
        void clear() 移除所有的键值对元素
        boolean containsKey(Object key) 判断集合是否包含指定的键
        boolean containsValue(Object Value) 判断集合是否包含指定的值
        boolean isEmpty() 判断集合是否为空
        int size() 集合的长度，也就是集合中键值对的个数
 */

import java.util.HashMap;
import java.util.Map;

public class MapBasicMethodDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();

        //V put(K key,V value) 添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        //V remove(Object key) 根据键删除键值元素
//        System.out.println(map.remove("郭靖"));
//        System.out.println(map.remove("郭襄"));

        //void clear() 移除所有的键值对元素
//        map.clear();

        //boolean containsKey(Object key) 判断集合是否包含指定的键
//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭襄"));

        //boolean containsValue(Object Value) 判断集合是否包含指定的值
//        System.out.println(map.containsValue("黄蓉"));
//        System.out.println(map.containsValue("郭襄"));

        //boolean isEmpty() 判断集合是否为空
        System.out.println(map.isEmpty());

        //int size() 集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());

        //输出
        System.out.println(map);
    }
}
