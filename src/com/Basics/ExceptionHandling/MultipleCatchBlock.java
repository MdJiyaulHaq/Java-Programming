package com.Basics.ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            arr[3] = 3 / 0;
        }
        // the handling of exceptions should be in most specific to most general order.
        catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code.");
    }
}
