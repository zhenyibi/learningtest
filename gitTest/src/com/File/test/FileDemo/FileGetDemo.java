package com.File.test.FileDemo;

import java.io.File;

/*
    File类的判断和获取：
        public boolean isDirectory() 测试此抽象路径名表示的File是否为目录
        public boolean isFile() 测试此抽象路径名表示的File是否为文件
        public boolean exist() 测试此抽象路径名表示的File是否存在

        public boolean getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        public boolean getPath() 将此抽象路径名转换为路径名字符串
        public boolean getName() 返回此抽象路径名表示的文件或目录的名称

        public String[] list() 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles() 返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileGetDemo {
    public static void main(String[] args) {
        File f1 = new File("gitTest\\test.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("----------");

        File f2 = new File("E:\\itcast");
        String[] strArray = f2.list();
        assert strArray != null;
        for (String str:strArray){
            System.out.println(str);
        }
        System.out.println("----------");

        File[] fileArray = f2.listFiles();
        assert fileArray != null;
        for (File file : fileArray){
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }

    }
}
