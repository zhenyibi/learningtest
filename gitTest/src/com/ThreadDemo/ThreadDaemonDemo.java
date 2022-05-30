package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * void setDaemon(boolean on)：将此线程标记为守护线程，当运行的所有线程均为守护线程时，退出java虚拟机(很快结束，但并不是立即退出)
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
