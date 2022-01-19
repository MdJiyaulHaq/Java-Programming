package com.Basics.ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        // Case: no exception occurs.
        int result = 7 / 5;
        try {
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("catch part will not be executed. since no exception has occured.");
        } finally {
            System.out.println("finally will be executed regardless of exception.");
        }
    }
}
//Rule: For each try block there can be zero or more catch blocks, but only one finally block.
//Note: The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error that causes the process to abort).
