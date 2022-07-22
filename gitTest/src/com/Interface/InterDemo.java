package com.Interface;

/**
 * @author zhenyiBi
 * @date 2022/7/22
 * 需求：
 * 1 定义一个接口Inter,里面有三个方法，抽象方法，默认方法和静态方法
 * 2 定义一个接口的实现类
 * 3 定义测试类，在主方法中按照多态的方法创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        Inter.test();
//        i.test();
        Flyable.test();
    }
}
