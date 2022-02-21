package com.File.test.FileDemo;

/*
    构造方法：
        FileOutputStream(String name): 创建文件输出流以指定的名称写入文件
        FileOutputStream(File file): 创建文件输出流以写入由指定的File对象表示的文件
    写数据的三种方式：
        void write(int b): 将指定的字节写入此文件输出流，一次写一个字节数据
        void write(byte[] b): 将b.length字节从指定的字节数组写入此文件输出流，一次写一个字节数组数据
        void write(byte[] b, int off, int len): 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，一次写一个字节数组的部分数据
 */


import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //FileOutputStream(String name): 创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("gitTest\\fos.txt");
//        FileOutputStream fos = new FileOutputStream(new File("gitTest\\fos.txt"));

        //void write(int b): 将指定的字节写入此文件输出流，一次写一个字节数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);

        //void write(byte[] b): 将b.length字节从指定的字节数组写入此文件输出流，一次写一个字节数组数据
//        byte[] bys = {97,98,99,100,101};
        //byte[] getBytes(): 返回字符串的对应字节数组
        byte[] bytes = "abcde".getBytes();
        fos.write(bytes);

        //void write(byte[] b, int off, int len): 将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，
        fos.write(bytes,0,bytes.length-1);

        //释放资源
        fos.close();
    }
}
