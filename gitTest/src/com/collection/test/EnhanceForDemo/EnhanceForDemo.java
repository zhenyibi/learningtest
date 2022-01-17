package com.collection.test.EnhanceForDemo;

import java.util.ArrayList;
import java.util.List;

public class EnhanceForDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println("--------");

        String[] strArray = {"hello", "world", "java"};
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("--------");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        for(String s : list){
            System.out.println(s);
        }

    }
}
