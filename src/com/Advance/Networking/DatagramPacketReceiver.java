package com.Advance.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramPacketReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(4444);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
        datagramSocket.receive(datagramPacket);
        String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
        System.out.println(str);
        datagramSocket.close();
    }
}
