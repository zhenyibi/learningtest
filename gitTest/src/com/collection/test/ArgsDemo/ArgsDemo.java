package com.collection.test.ArgsDemo;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int... a) {
        int res = 0;
        for (int i : a) {
            res += i;
        }
        return res;
    }

    /*
    多个数据求和
    public static int sum(int b, int... a) {
        int res = 0;
        for (int i : a) {
            res += i;
        }
        return res;
    }
     */
}

