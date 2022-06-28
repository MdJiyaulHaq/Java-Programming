package com.Advance.FileHandlingAndIO;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
