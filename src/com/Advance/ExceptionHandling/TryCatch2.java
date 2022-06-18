package com.Advance.ExceptionHandling;

public class TryCatch2 {
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            int result = a / b;
        }
        // handling the exception using Exception class
        catch (Exception e) {
            System.out.println("Division by zero is not allowed.");
            // custom message can also be displayed.
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
