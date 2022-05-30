package com.BoxDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 */
public class Customer implements Runnable{
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while(true) {
            b.get();
        }
    }
}
