package com.Lambda;

/**
 * @author zhenyiBi
 * @date 2022/7/22
 */
public class LambdaDemo2 {

    public static void main(String[] args) {

        //完整版Lambda表达式
        useFlyable((String s) -> {
            System.out.println(s + "飞起来了");
        });

        //参数可以省略
        useFlyable((s) -> {
            System.out.println(s + "飞起来了");
        });

        //如果参数有且只有一条，那么小括号可以省略
        useFlyable(s -> {
            System.out.println(s + "飞起来了");
        });

        //如果代码块的语句只有一条，可以省略大括号和分号
        useFlyable(s -> System.out.println(s + "飞起来了"));

        //完整版
        useAddable((int x, int y) -> {
            return x + y;
        });

        //省略参数，有多个参数的情况下，不能只省略一个
        useAddable((x, y) -> {
            return x + y;
        });

        //省略大括号和分号,如果有return，也要一起省略
        useAddable((x, y) -> x + y);
    }

    private static void useFlyable(Flyable f) {
        f.fly("Bob");
    }

    private static void useAddable(Addable a) {
        System.out.println(a.add(10, 20));
    }
}
