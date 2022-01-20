package com.Advance.InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadString {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            int i = 0;
            while ((i = fileInput.read()) != -1) {
                System.out.println((char) i);
            }
            fileInput.close();
            System.out.println("read string successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
