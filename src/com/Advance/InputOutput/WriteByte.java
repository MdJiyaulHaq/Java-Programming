package com.Advance.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            fileOutput.write(7);
            fileOutput.write(8);
            fileOutput.write(6);
            fileOutput.close();
            System.out.println("written to the file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
