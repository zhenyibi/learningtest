package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 * <p>
 * 方法一：继承Thread类
 * 1：定义一个类MyThread继承Thread类
 * 2：在MyThread类中重写run方法
 * 3：创建MyThread类的对象
 * 4：启动线程
 * 注：
 * run方法和start方法的区别：
 * run方法：封装线程执行的代码，直接调用，相当于普通方法的调用
 * start方法：启动线程，然后由JVM调用此线程的run方法
 */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        my1.run();
//        my2.run();
//
//        my1.setName("线程1");
//        my2.setName("线程2");

        MyThread my1 = new MyThread("线程1");
        MyThread my2 = new MyThread("线程2");
//        void start(); 导致此线程开始执行；java虚拟机调用此线程的run方法
        my1.start();
        my2.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
