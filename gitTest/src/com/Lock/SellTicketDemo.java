package com.Lock;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * 1、同步方法：就是把synchronized关键字加到方法上
 * 格式：修饰符 synchronized 返回值类型 方法名(方法参数){ }
 * 2、同步方法的锁对象是 this
 * 3、同步静态方法：就是把synchronized关键字加到静态方法上
 * 格式：修饰符 static synchronized 返回值类型 方法名(方法参数) { }
 * 4、同步静态方法的锁对象是 类名.class
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}