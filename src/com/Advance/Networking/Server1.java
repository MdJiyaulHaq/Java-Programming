package com.Advance.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string = dataInputStream.readUTF();
            System.out.println("message from client is" + string);
            serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
