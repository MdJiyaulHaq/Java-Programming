package com.Advance.InputOutput;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            int i = 0;
            while ((i = fr.read()) != -1) {
                System.out.println((char) i);
            }
            System.out.println("read char successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
