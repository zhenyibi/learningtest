package com.collection.test.PokerDemo;

/*
    需求：实现斗地主过程中的洗牌，发牌和看牌
    思路：
        1 创建一个牌盒，定义一个集合对象，用ArrayList集合实现
        2 在牌盒中装牌
        3 洗牌，打乱牌盒中的牌，用Collections的shuffle()方法实现
        4 发牌，遍历集合，给三个玩家发牌
        5 看牌，三个玩家分别遍历自己的牌
 */

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        //创建一个牌盒，定义一个集合对象，用ArrayList集合实现
        ArrayList<String> arrayList = new ArrayList<>();

        //在牌盒中装牌
        //定义花色数组
        String[] colors = {"♣", "♥", "♠", "♦"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String number : numbers) {
                arrayList.add(color + number);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");

        //洗牌，打乱牌盒中的牌，用Collections的shuffle()方法实现
        Collections.shuffle(arrayList);
//        System.out.println(arrayList);

        //发牌，遍历集合，给三个玩家发牌
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> fqyArray = new ArrayList<>();
        ArrayList<String> zmyArray = new ArrayList<>();
        ArrayList<String> dpArray = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            String result = arrayList.get(i);
            if (i >= arrayList.size() - 3) {
                dpArray.add(result);
            } else if (i % 3 == 0) {
                lqxArray.add(result);
            } else if (i % 3 == 1) {
                fqyArray.add(result);
            } else {
                zmyArray.add(result);
            }
        }

        //看牌，三个玩家分别遍历自己的牌
        lookPoker("lqx", lqxArray);
        lookPoker("fqy", fqyArray);
        lookPoker("zmy", zmyArray);
        lookPoker("dp", dpArray);
    }

    public static void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.print(name + "的牌为：");
        for (String array : arrayList) {
            System.out.print(array + " ");
        }
        System.out.println();
    }
}
