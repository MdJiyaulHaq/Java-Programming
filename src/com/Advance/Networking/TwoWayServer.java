package com.Advance.Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import static java.lang.System.in;
import static java.lang.System.out;

public class TwoWayServer {
    public static void main(String[] args) throws Exception {
        try {
            Socket socket;
            try (ServerSocket serverSocket = new ServerSocket(3333)) {
                socket = serverSocket.accept();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

            String msgToBeSent = "";

            while (!(msgToBeSent.equals("stop"))) {
                msgToBeSent = bufferedReader.readLine();
                dataOutputStream.writeUTF(msgToBeSent);
                String receivedMsg = dataInputStream.readUTF();
                out.println("TwoWayClient Says:" + receivedMsg);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
