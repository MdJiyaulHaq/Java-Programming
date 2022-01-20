package com.Advance.InputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\muham\\IdeaProjects\\Java-Programming\\src\\com\\Advance\\InputOutput\\test.txt");
            fw.write("Muhammad SAW is messenger of Almighty Allah.");
            fw.close();
            System.out.println("string written successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
