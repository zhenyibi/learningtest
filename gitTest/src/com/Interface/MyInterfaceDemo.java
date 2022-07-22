package com.Interface;

/**
 * @author zhenyiBi
 * @date 2022/7/22
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();
    }
}
