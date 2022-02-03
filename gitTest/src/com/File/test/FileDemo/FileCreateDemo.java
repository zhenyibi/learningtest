package com.File.test.FileDemo;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能：
        public boolean createNewFile() 当具有该名称的文件不存在时，创建一个由该抽象路径名称命名的新空文件
        public boolean mkdir() 创建由此抽象路径名命名的目录
        public boolean mkdirs() 创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录
        以上均满足：如果不存在则创建文件或目录，并返回true；如果存在，则返回false
 */
public class FileCreateDemo {
    public static void main(String[] args) throws IOException {
        //在E:\\itcast目录下创建一个文件java.txt
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile());

        //在E:\\itcast目录下创建一个目录JavaSE
        File f2 = new File("E:\\itcast\\JavaSE");
        System.out.println(f2.mkdir());

        //在E:\\itcast目录下创建一个目录JavaWEB\\HTML
        File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());

    }
}
