package com.Advance.FileHandlingAndIO;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.println(string);
        }

    }
}
