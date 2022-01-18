package com.Advance;

public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            int result = a / b;
            System.out.println("some more codes.");
            // codes that doesn't throw error shouldn't be put in try block
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("the remaining code");
        }
    }
}
