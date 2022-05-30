package com.Lock;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 */
public class SellTicketLockDemo {
    public static void main(String[] args) {
        SellTicketLock st = new SellTicketLock();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
