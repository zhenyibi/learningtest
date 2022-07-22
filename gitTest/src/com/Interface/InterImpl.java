package com.Interface;

/**
 * @author zhenyiBi
 * @date 2022/7/22
 */
public class InterImpl implements Inter, Flyable {
    @Override
    public void show() {
        System.out.println("show方法执行了");
    }
}
