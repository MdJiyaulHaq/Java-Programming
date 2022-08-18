package com.Advance.FileHandlingAndIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("example.txt");
            fileWriter.write("We surely belong to Allah and to him we shall return.");
            fileWriter.write("\nBeing with the name of Allah who is most merciful.");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
