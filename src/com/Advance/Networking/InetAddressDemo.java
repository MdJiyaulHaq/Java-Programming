package com.Advance.Networking;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        // getByName for internet
        InetAddress ip = InetAddress.getByName("www.javatpoint.com");
        System.out.println(Arrays.toString(ip.getAddress()));
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());

        // getLocalHost for local host
        InetAddress ip2 = InetAddress.getLocalHost();
        System.out.println(Arrays.toString(ip2.getAddress()));
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
    }
}
