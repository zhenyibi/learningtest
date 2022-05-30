package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * Thread类中设置和获取线程优先级的方法：
 * public final void setPriority(int newPriority)：更改此线程的优先级
 * public final int getPriority()：返回此线程的优先级
 * 线程优先级高仅仅表示线程获取的CPU时间片的几率高
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int getPriority()：返回此线程的优先级
        System.out.println(tp1.getPriority());//5
        System.out.println(tp2.getPriority());//5
        System.out.println(tp3.getPriority());//5
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        //public final void setPriority(int newPriority)：更改此线程的优先级
        //tp1.setPriority(1000);//java.lang.IllegalArgumentException
        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
