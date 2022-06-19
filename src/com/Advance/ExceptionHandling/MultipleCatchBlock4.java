package com.Advance.ExceptionHandling;

public class MultipleCatchBlock4 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        }
// but if no corresponding catch block is found then the most general exception is thrown
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
// remember that if order of exception is not maintained then the 'compile time error' will be thrown.