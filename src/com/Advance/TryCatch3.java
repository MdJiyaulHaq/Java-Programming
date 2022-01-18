package com.Advance;

public class TryCatch3 {
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            int result = a / b;
        }
        // handling the exception using Exception class
        catch (Exception e) {
            System.out.println(a / (b + 1));
            // exception can even be handled in catch block.
        }
        System.out.println("rest of the code.");
    }
}
