package com.File.test.FileDemo;

import java.util.Properties;
import java.util.Set;

/**
 * @author zhenyiBi
 * @date 2022/3/14
 */

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties<String,String>();//错误
        Properties prop = new Properties();

        //存储元素
        prop.put("0001", "张三");
        prop.put("0002", "李四");
        prop.put("0003", "王五");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }

}
