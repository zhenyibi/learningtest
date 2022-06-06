package com.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author zhenyiBi
 * @date 2022/6/6
 */

/*
    InetAddress 此类表示Internet协议（IP）地址

    public static InetAddress getByName(String host): 确定主机名称的IP地址，主机名称可以是机器名称，也可是IP地址
    public String getHostName(): 获取此IP地址的主机名
    public String getHostAddress(): 返回文本显示中的IP地址字符串
 */

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //public static InetAddress getByName(String host): 确定主机名称的IP地址，主机名称可以是机器名称，也可是IP地址
        //InetAddress address = InetAddress.getByName("maybe");

        InetAddress address = InetAddress.getByName("198.168.1.4");

        //public String getHostName(): 获取此IP地址的主机名
        String hostName = address.getHostName();
        //public String getHostAddress(): 返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();

        System.out.println("主机名：" + hostName);
        System.out.println("IP地址：" + ip);
    }
}
