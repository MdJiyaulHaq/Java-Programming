package com.Advance.ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        int a = 4, b = 0;
        int[] arr = new int[5];
        String s = null;
        try {
            try {
                int result = a / b;
            } catch (ArithmeticException e1) {
                System.out.println(e1);
            }
            try {
                arr[6] = 3;
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println(e2);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        // also, if the catch block for exception is not defined then,
        //the java will automatically invoke one.
    }
}
