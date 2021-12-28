package com.Basics;

public class string {
    public static void main(String[] args) {
        System.out.println("Strings in java.");
        String str = "Muhammad peace be upon him.";
        String str2 = "He is the Prophet of Allah.";
        System.out.println("The length of the above string is :" + str.length());

        // finding character in the string
        System.out.println(str.indexOf("be"));

        // concatenate string
        System.out.println(str + str2);


    }
}
