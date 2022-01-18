package com.Advance;

public class MultipleCatchBlock3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            arr[3] = 3 / 0;
            System.out.println(arr[9]);
        }
        // only one exception can occur and corresponding catch block is executed.

        catch (ArithmeticException e) {
            System.out.println("arithmetic exception occurs");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array exception occurs");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("parent exception occurs.");
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
