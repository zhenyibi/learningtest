package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * static void sleep(long millis)：使当前正在执行的线程停留指定的毫秒数
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("张三");
        ts2.setName("李四");
        ts3.setName("王五");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}