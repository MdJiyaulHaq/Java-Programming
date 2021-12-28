package com.Basics;

class Student1 {
    int roll_no = 15;
    String name = "Md";

    void put(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    void get() {
        System.out.println(name + "\n" + roll_no);
    }
}

public class ClassesAndObject {

    public static void main(String[] args) {
        Student1 obj1 = new Student1();
        System.out.println(obj1.name + "\n" + obj1.roll_no);
        Student1 obj2 = new Student1();
        obj2.name = "Mausam";
        obj2.roll_no = 16;
        System.out.println(obj2.name + "\n" + obj2.roll_no);

        // initialize through constructor
        Student1 obj3 = new Student1();
        obj3.put(14, "Mimamsa");
        obj3.get();
    }
}
