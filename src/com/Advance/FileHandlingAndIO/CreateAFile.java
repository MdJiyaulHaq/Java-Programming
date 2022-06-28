package com.Advance.FileHandlingAndIO;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        file.createNewFile();
    }
}
