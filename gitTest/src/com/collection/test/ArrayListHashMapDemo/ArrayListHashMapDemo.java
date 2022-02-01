package com.collection.test.ArrayListHashMapDemo;

/*
    需求：
        创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap，每一个HashMap的键和值都是String，并遍历
    思路：
        1 创建ArrayList集合
        2 创建HashMap集合，并添加键值对元素
        3 把HashMap作为元素添加进ArrayList集合
        4 遍历ArrayList集合
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMapDemo {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<>();

        //创建HashMap集合，并添加键值对元素
        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        //把HashMap作为元素添加进ArrayList集合
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        //把HashMap作为元素添加进ArrayList集合
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        //把HashMap作为元素添加进ArrayList集合
        array.add(hm3);

        //遍历ArrayList集合
        for (HashMap<String, String> hm : array) {
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}
