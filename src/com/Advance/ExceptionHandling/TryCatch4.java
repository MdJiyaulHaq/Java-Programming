package com.Advance.ExceptionHandling;

public class TryCatch4 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 1};
        try {
            System.out.println(arr[6]);
        }
        // exception handling for arrays
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
