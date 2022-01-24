package com.Advance.Networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class ClientHari {
    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 6666);
            DataOutputStream dataOutputStream = new DataOutputStream(server.getOutputStream());
            dataOutputStream.writeUTF("Hello Server!");
            dataOutputStream.flush();
            dataOutputStream.close();
            server.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
