package com.Advance.Networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLconnectionClass {
    public static void main(String[] args) throws Exception {
        try {
            URL url = new URL("https://codekavya.com/");
            URLConnection urlConnection = url.openConnection();
            InputStream dataInputStream = urlConnection.getInputStream();
            int i;
            while ((i = dataInputStream.read()) != -1) {
                System.out.println((char) i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
