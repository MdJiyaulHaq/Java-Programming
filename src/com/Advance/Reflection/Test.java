package com.Advance.Reflection;

class Example {
}

public class Test {
    public static void main(String[] args) throws Exception {
        // class name using forName()
        Class c = Class.forName("com.Advance.Reflection.Example");
        System.out.println(c.getName());
    }
}