package com.KU;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Codes Before the exception");
        try {
            int a = 3, b = 0;
            int result = a / b;
        } catch (ArithmeticException err) {
            System.out.println(err);
        }
        System.out.println("Codes After the expectation part");
    }
}
