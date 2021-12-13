package com.PU;

class Student {
    int roll_no = 15;
    String name = "Md";
    void put(int roll_no, String name){
        this.roll_no = roll_no;
        this.name= name;
    }
    void get(){
        System.out.println(name + "\n" + roll_no);
    }
}

public class ClassesAndObject {

    public static void main(String[] args) {
        Student obj1 = new Student();
        System.out.println(obj1.name +"\n" + obj1.roll_no);
        Student obj2 = new Student();
        obj2.name = "Mausam";
        obj2.roll_no = 16;
        System.out.println(obj2.name + "\n" + obj2.roll_no);
        Student obj3 = new Student();
        obj3.put(14, "Mimamsa");
        obj3.get();
    }
}
