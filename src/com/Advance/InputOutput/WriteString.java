package com.Advance.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteString {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            String name = "Muhammad";
            byte nameBytes[] = name.getBytes(StandardCharsets.UTF_8);
            // this converts string into bytes array
            fileOutput.write(nameBytes);
            fileOutput.close();
            System.out.println("written to the file successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
