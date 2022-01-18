package com.Advance.ExceptionHandling;

public class MultipleCatchBlock2 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            System.out.println(arr[6]);
        }
        // the handling of exceptions should be in most specific to most general order.
        catch (ArithmeticException e) {
            System.out.println("arithmetic exception occurs");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array exception occur");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("parent exception occurs.");
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
