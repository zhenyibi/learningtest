package com.File.test.FileDemo;

/*
    需求：把模块目录下的文件进行复制
    思路：
        1 根据数据源创建字符输入流对象
        2 根据目的地创建字符输出流对象
        3 读写数据，复制文件
        4 释放资源
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("gitTest\\FileConstructDemo.java");
        //根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("gitTest\\Copy.java");

        //读写数据，复制文件
        /*
        int ch;
        while ((ch=fr.read())!= -1){
            fw.write(ch);
        }
        */

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
