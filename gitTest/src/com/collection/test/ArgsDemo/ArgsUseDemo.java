package com.collection.test.ArgsDemo;

/*
    public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表
    下述暂不支持：
    public static <E> List<T> of (E... elements)：返回包含任意数量元素的不可变列表
    public static <E> Set<E> of (E... elements)：返回一个包含任意数量元素的不可变集合
 */

import java.util.Arrays;
import java.util.List;

public class ArgsUseDemo {
    public static void main(String[] args) {
        //    public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");

//        list.add("javaee");//UnsupportedOperationException
//        list.remove("world");//UnsupportedOperationException
        list.set(1,"javaee");
        System.out.println(list);

    }
}
