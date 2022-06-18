package com.Advance.ExceptionHandling;

public class FinallyBlock2 {
    public static void main(String[] args) {
        // Case: exception occurs, but not handled.
        int a = 4, b = 0;
        try {
            int result = a / b;
        } catch (NullPointerException e) {
            System.out.println("this will only accept null pointer exception. but not arithmetic.");
        } finally {
            System.out.println("finally will be executed regardless of exception handled or not.");
        }
    }
}

