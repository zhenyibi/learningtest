package com.Lambda;

/**
 * @author zhenyiBi
 * @date 2022/7/21
 */
public class FlyableImpl implements Flyable {
    @Override
    public void fly(String s) {
        System.out.println(s + "飞起来了");
    }
}
