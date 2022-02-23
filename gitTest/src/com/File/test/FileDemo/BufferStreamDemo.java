package com.File.test.FileDemo;

/*
    字节缓冲流
        BufferedOutputStream
        BufferedInputStream
    构造方法：
        BufferedOutputStream(OutputStream out)
        BufferedInputStream(BufferInputStream in)
 */


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        /*
        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("gitTest\\bos.txt"));
        //写数据
        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
        bos.write("world\r\n".getBytes());
        //释放资源
        bos.close();
        */

        //字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("gitTest\\bos.txt"));
        //一次读一个字节读数据
//        int by;
//        while((by=bis.read())!=-1){
//            System.out.print((char)by);
//        }

        //一次读一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        //释放资源
        bis.close();
    }
}
