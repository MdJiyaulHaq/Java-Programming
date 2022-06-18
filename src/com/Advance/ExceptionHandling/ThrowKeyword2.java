package com.Advance.ExceptionHandling;

public class ThrowKeyword2 {

    // throwing user defined exception

    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("you are not eligible for voting my friend.");
        } else {
            System.out.println("you can vote, hopefully not for Biden.");
        }
    }

    public static void main(String[] args) {
        validate(17);
        System.out.println("rest of the codes.");
    }
}
