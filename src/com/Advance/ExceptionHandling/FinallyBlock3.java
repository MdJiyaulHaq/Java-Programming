package com.Advance.ExceptionHandling;

public class FinallyBlock3 {
    public static void main(String[] args) {
        // Case: exception occurs, and handled too.
        int a = 4, b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception will be revoked.");
            System.out.println(e);
        } finally {
            System.out.println("finally will be executed regardless of exception handled or not.");
        }
    }
}


