package com.Lock;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 */
public class SellTicket implements Runnable {
    //    private int ticket = 100;
    private static int ticket = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (obj) {
//                synchronized (this) {
                synchronized (SellTicket.class) {
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                        ticket--;
                    }
                }
            } else {
                sellTicket();
            }
            x++;
        }
    }

//    private synchronized void sellTicket() {
//        if (ticket > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
//            ticket--;
//        }
//    }

    private static synchronized void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
            ticket--;
        }
    }
}
