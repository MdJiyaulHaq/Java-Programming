package com.Advance.Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientMd {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF("Hello this is client Md.");
        dataOutputStream.flush();
        dataOutputStream.close();
        socket.close();
    }
}
