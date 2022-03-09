package com.Advance.Reflection;

class Example4 {
    void greet() {
        System.out.println("Asalamo alaikum");
    }
}

public class newInstanceMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("com.Advance.Reflection.Example4");
        Example4 e4 = (Example4) c.newInstance();
        e4.greet();
    }
}
