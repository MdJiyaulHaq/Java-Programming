package com.Advance.Networking;

import java.net.URL;

public class URLclass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://codekavya.com/");
            System.out.println("protocol" + url.getProtocol());
            System.out.println("authority" + url.getAuthority());
            System.out.println("port" + url.getPort());
            System.out.println("host" + url.getHost());
            System.out.println("file" + url.getFile());
            System.out.println("path" + url.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
