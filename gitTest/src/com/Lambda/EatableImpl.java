package com.Lambda;

/**
 * @author zhenyiBi
 * @date 2022/7/21
 */
public class EatableImpl implements Eatable{
    @Override
    public void eat() {
        System.out.println("一天一苹果，医生远离我");
    }
}
