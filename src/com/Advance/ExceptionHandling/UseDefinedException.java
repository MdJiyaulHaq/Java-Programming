package com.Advance.ExceptionHandling;

class InvalidAge extends Exception {
    InvalidAge(String msg) {
        System.out.println(msg);
    }
}

public class UseDefinedException {
    public static void main(String[] args) {
        try {
            vote(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void vote(int age) throws InvalidAge {
        if (age < 18) {
            throw new InvalidAge("not eligible");
        } else
            System.out.println("eligible");
    }
}
