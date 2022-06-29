package com.Advance.FileHandlingAndIO;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DeleteAFile {
    public static void main(String[] args) throws Exception {
        File file2 = new File("test.txt");
        file2.createNewFile();
        FileWriter fileWriter2 = new FileWriter("test.txt");
        fileWriter2.write("this file is written with filewritter.");
        fileWriter2.close();
        Scanner scanner2 = new Scanner("test.txt");
        while (scanner2.hasNext()) {
            String line = scanner2.nextLine();
            System.out.println(line);
        }
        file2.delete();

    }

}
