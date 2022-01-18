package com.Advance;

public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("the remaining code");
        }
    }
}
