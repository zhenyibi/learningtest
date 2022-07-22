package com.Interface;

/**
 * @author zhenyiBi
 * @date 2022/7/22
 */
public interface MyInterface {
    void show1();
    void show2();

    default void show3(){
        System.out.println("show3");
    };
}
