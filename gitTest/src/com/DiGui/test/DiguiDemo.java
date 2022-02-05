package com.DiGui.test;
/*
    递归概述：
        以编程的角度来看，递归是方法定义中调用方法本身的现象
 */
public class DiguiDemo {
    public static void main(String[] args) {
        System.out.println(f(20));
    }

    public static int f(int n){
        if(n==1 || n== 2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
