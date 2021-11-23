package com.PU;

public class math {
    public static void main(String[] args) {
        System.out.println("Math in java.");
        int maximum = Math.max(5,2);
        int minimum = Math.min(3,4);
        int absolute = Math.abs(-9);
        float square_root = (float)Math.sqrt(44);
        float rand = (float) Math.random(); // returns the random number between 0 and 1

        // for greater range
        int rand2 = (int)(Math.random()*78); // returns the random number between 0 and 77
    }
}
