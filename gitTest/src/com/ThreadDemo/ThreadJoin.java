package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 */
public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
