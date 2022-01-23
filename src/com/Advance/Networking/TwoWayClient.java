package com.Advance.Networking;

import java.io.*;
import java.net.Socket;

import static java.lang.System.in;
import static java.lang.System.out;

public class TwoWayClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3333);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String msgToBeSent = "";
        String receavedmsg = "";
        while (!(msgToBeSent.equals("stop"))) {
            msgToBeSent = bufferedReader.readLine();
            dataOutputStream.writeUTF(msgToBeSent);
            receavedmsg = dataInputStream.readUTF();
            out.println("TwoWayClient Says:" + receavedmsg);
        }

    }
}
