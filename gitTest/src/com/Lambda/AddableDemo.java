package com.Lambda;

/**
 * @author zhenyiBi
 * @date 2022/7/21
 * 练习2：
 * 1 定义一个接口(Addable),里面定义一个抽象方法，int add(int x, int y);
 * 2 定义一个测试类（AddableDemo）,在测试类中提供两个方法
 * 一个是useAddable(Addable a)
 * 一个方法是主方法，在主方法中调用useAddable方法
 */
public class AddableDemo {
    public static void main(String[] args) {

        //lambda
        useAddable((int x, int y) -> {
            return x+y;
        });
    }

    private static void useAddable(Addable a) {
        int sum = a.add(1, 2);
        System.out.println(sum);
    }
}
