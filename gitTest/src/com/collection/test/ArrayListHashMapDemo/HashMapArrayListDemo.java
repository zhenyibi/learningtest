package com.collection.test.ArrayListHashMapDemo;

/*
    需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList
        每一个ArrayList的元素是String，并遍历

    思路：
        1 创建HashMap集合对象
        2 创建ArrayList集合，并添加元素
        3 把ArrayList作为元素添加到HashMap集合
        4 遍历HashMap集合
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapArrayListDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义", sgyy);

        ArrayList<String> xyj = new ArrayList<>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("西游记", xyj);

        ArrayList<String> shz = new ArrayList<>();
        shz.add("武松");
        shz.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传", shz);

        //遍历
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}
