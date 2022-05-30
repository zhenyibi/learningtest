package com.ThreadDemo;

/**
 * @author zhenyiBi
 * @date 2022/5/30
 */
public class MyThread extends Thread {

    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }
    //重写run方法：用来封装被线程执行的代码
    /*
        Thread类中获取和设置线程名称的方法：
            void setName(String name)：将此线程的名称更改为等于参数name
            String getName()：返回此线程的名称
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
