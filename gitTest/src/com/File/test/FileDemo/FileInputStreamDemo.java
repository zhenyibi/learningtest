package com.File.test.FileDemo;

/*
    需求：
        把文件fos.txt中的内容读取出来在控制台输出
    FileInputStream：从文件中读取输入字节
    步骤：
        1 创建字节输入流对象
        2 调用字节输入流对象的读数据方法
        3 释放资源
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("gitTest\\fos.txt");

        //调用字节输入流对象读取数据
        //int read(): 从该输入流读取一个字节数据；如果达到文件末尾，读取的数据返回值为-1

        /*
        //第一次读
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);//

        //第二次读
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);
        */

        /*
        //循环读取
        int by = fis.read();
        while (by != -1){
            System.out.print((char)by);
            by = fis.read();
        }
        */

        //循环改进
        int by1;
        while ((by1 = fis.read()) != -1) {
            System.out.print((char) by1);
        }

        //释放资源
        fis.close();
    }
}
