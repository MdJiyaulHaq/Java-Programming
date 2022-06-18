package com.Advance.ExceptionHandling;

public class ThrowKeyword3 {

    public static void main(String[] args) {
        try {
            throw new UserDefinedException("Md");
        } catch (UserDefinedException e) {
            System.out.println(e);
        }
        System.out.println("rest of the codes.");
    }

    // throwing user defined exception
    static class UserDefinedException extends Exception {
        public UserDefinedException(String name) {
            super(name);
        }
    }

    // testing the exception
    public class Test {

    }
}
