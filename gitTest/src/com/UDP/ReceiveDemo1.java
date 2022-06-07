package com.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zhenyiBi
 * @date 2022/6/7
 */

/*
    UDP接收数据：
        因为接收端不知道发送端什么时候停止发送，故采用死循环接收数据
 */
public class ReceiveDemo1 {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        while(true) {
            //创建一个数据包用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象方法接收数据
            ds.receive(dp);

            //解析数据包，并把数据在控制台显示
            System.out.println("数据是：" + new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端
//        ds.close();

    }
}
