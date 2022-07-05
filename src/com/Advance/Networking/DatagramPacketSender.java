package com.Advance.Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class DatagramPacketSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        String string = "We surely belong to Allah and to him we shall return.";
        InetAddress ip = InetAddress.getByName("https://www.javatpoint.com");
        DatagramPacket datagramPacket = new DatagramPacket(string.getBytes(StandardCharsets.UTF_8), string.length(), ip, 4444);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
