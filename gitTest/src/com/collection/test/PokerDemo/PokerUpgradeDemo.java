package com.collection.test.PokerDemo;

/*
    需求：通过程序实现斗地主过程中的洗牌，发牌和看牌，要求对牌进行排序
    思路：
        1 创建HashMap，键是编号，值是牌
        2 创建ArrayList，存储编号
        3 创建花色数组和点数数组
        4 从0开始往HashMap里面存储编号，并存储对应的值。同时往ArrayList存储编号
        5 洗牌（编号），用Collections的shuffle()方法实现
        6 发牌（编号），为保证编号是排序的，创建TreeSet集合接收
        7 定义方法看牌（遍历TreeSet集合，获取编号，到HashMap中找对应的值）
        8 调用看牌方法
 */

import java.util.*;

public class PokerUpgradeDemo {
    public static void main(String[] args) {
        //创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();

        //创建ArrayList，存储编号
        ArrayList<Integer> arrayList = new ArrayList<>();

        //创建花色数组和点数数组
        String[] colors = {"♣", "♥", "♠", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //从0开始往HashMap里面存储编号，并存储对应的值。同时往ArrayList存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                arrayList.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        arrayList.add(index);
        index++;
        hm.put(index, "大王");
        arrayList.add(index);

        //洗牌（编号），用Collections的shuffle()方法实现
        Collections.shuffle(arrayList);

        //发牌（编号），为保证编号是排序的，创建TreeSet集合接收
        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> zmySet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < arrayList.size(); i++) {
            Integer res = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                dpSet.add(res);
            } else if (i % 3 == 0) {
                lqxSet.add(res);
            } else if (i % 3 == 1) {
                fqySet.add(res);
            } else {
                zmySet.add(res);
            }
        }

        //调用看牌方法
        lookPoker("lqx",lqxSet,hm);
        lookPoker("fqy",fqySet,hm);
        lookPoker("zmy",zmySet,hm);
        lookPoker("dp",dpSet,hm);
    }

    //定义方法看牌（遍历TreeSet集合，获取编号，到HashMap中找对应的值）
    public static void lookPoker(String name, TreeSet<Integer> treeSet, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是：");
        for (Integer key : treeSet) {
            String value = hm.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
