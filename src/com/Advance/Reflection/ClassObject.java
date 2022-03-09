package com.Advance.Reflection;

interface Example3 {
}

class Example2 {
}

public class ClassObject {
    public static void main(String[] args) throws Exception {
        // object of a class using forName()
        Class c = Class.forName("com.Advance.Reflection.Example2");
        System.out.println(c.isInterface());
        System.out.println(c.isPrimitive());
        System.out.println(c.isArray());

        Class c2 = Class.forName("com.Advance.Reflection.Example3");
        System.out.println(c2.isInterface());
        System.out.println(c2.isPrimitive());
        System.out.println(c2.isArray());

    }
}
