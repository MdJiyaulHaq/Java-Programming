package com.PU;

public class AnonymousObject {
    public static void main(String[] args) {
        AnonymousObject a1 = new AnonymousObject(), a2 = new AnonymousObject(); // non-anonymous objects
        a1.factorial(5);
        a2.factorial(4);
        new AnonymousObject().factorial(5); // anonymous object
    }

    void factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("factorial is :" + fact);
    }
}