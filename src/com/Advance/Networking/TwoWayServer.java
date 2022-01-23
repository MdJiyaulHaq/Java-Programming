package com.Advance.Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.System.in;
import static java.lang.System.out;

public class TwoWayServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            Socket socket = serverSocket.accept();
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

            String msgToBeSent = "";
            String receavedmsg = "";
            while (!(msgToBeSent.equals("stop"))) {
                msgToBeSent = bufferedReader.readLine();
                dataOutputStream.writeUTF(msgToBeSent);
                receavedmsg = dataInputStream.readUTF();
                out.println("TwoWayClient Says:" + receavedmsg);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
