package com.collection.test.MapDemo;

/*
    需求：键盘录入一个字符串，要求统计字符串中每个字符串出现的次数

    思路：1 键盘录入一个字符串 aababcabcdabcde
         2 创建HashMap集合，键是Character，值是Integer
         3 遍历字符串，得到每一个字符串
         4 拿得到的每一个字符串作为键到HashMap集合中去找对应的值，看返回值
            如果返回值是null，说明该字符串在HashMap中不存在，就把该字符串作为键，1作为值存储
            如果返回值不为null，说明该字符串在HashMap集合中存在，把该值加1，然后重新存储该字符串
         5 遍历HashMap集合，得到键和值进行拼接
         6 输出结果
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapCountCharacterDemo {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //创建HashMap集合，键是Character，值是Integer
//        HashMap<Character,Integer> hm = new HashMap<>();
        TreeMap<Character,Integer> hm = new TreeMap<>();//对键进行排序

        //遍历字符串，得到每一个字符串
        for(int i = 0; i < line.length();i++){
            char key = line.charAt(i);
            //拿得到的每一个字符串作为键到HashMap集合中去找对应的值，看返回值
            Integer value = hm.get(key);
            if(value==null){
                //如果返回值是null，说明该字符串在HashMap中不存在，就把该字符串作为键，1作为值存储
                hm.put(key,1);
            }else{
                //如果返回值不为null，说明该字符串在HashMap集合中存在，把该值加1，然后重新存储该字符串
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap集合，得到键和值进行拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for(Character key: keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
