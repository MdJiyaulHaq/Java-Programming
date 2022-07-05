package com.Advance.Networking;

import java.net.InetAddress;
import java.util.Arrays;

public class InetAddressDemo2 {
    public static void main(String[] args) throws Exception {
        InetAddress ip = InetAddress.getByName("www.javatpoint.com");
        System.out.println(ip);
        InetAddress[] ip2 = InetAddress.getAllByName("www.javatpoint.com");
        System.out.println(Arrays.toString(ip2));
        byte[] address = {-84, 67, -46, 87};
        InetAddress ip3 = InetAddress.getByAddress(address);
        System.out.println(ip3);
        System.out.print("\nAddress : " + Arrays.toString(ip.getAddress()));
        System.out.print("\nHost Address : " + ip.getHostAddress());
        System.out.print("\nisAnyLocalAddress : " + ip.isAnyLocalAddress());
        System.out.print("\nisLinkLocalAddress : " + ip.isLinkLocalAddress());
        System.out.print("\nisLoopbackAddress : " + ip.isLoopbackAddress());
        System.out.print("\nisMulticastAddress : " + ip.isMulticastAddress());
        System.out.print("\nisSiteLocalAddress : " + ip.isSiteLocalAddress());
        System.out.print("\nhashCode : " + ip.hashCode());
        System.out.print("\n Is ip1 == ip2 : " + ip.equals(ip2));

    }
}
