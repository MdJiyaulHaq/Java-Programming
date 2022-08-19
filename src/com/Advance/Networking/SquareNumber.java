package com.Advance.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SquareNumber {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String string = dataInputStream.readUTF();
        int number = Integer.parseInt(string);
        int square = number * number;
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(square + "");

    }
}
