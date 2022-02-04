package com.File.test.FileDemo;

/*
    File类删除功能：
        public boolean delete() 删除此抽象路径名表示的文件或目录
 */

import java.io.File;
import java.io.IOException;

public class FileDeleteDemo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("gitTest\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.delete());
        System.out.println("----------");

        File f2 = new File("gitTest\\itcast");
        System.out.println(f2.mkdir());
        System.out.println(f2.delete());

    }
}
