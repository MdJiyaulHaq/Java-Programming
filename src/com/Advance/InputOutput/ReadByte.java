package com.Advance.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByte {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            int c = fileInput.read();
            System.out.println((char) c);
            fileInput.close();
            System.out.println("read char successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
