package com.ThreadDemo;

import java.util.*;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * 线程安全的类：StringBuffer、Vector、HashTable
 * 对应线程不安全的类分别为：StringBuilder、ArrayList、HashMap
 */
public class SafeThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<>();//已经不使用
        ArrayList<String> array = new ArrayList<>();

        Hashtable<String, String> ht = new Hashtable<>();//已经不使用
        HashMap<String, String> hm = new HashMap<>();

        //static <T> List<T> synchronizedList (List<T> list) 返回由指定列表支持的同步（线程安全）列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }
}
