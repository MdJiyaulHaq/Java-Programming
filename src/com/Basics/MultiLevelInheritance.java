package com.Basics;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        GrandFather g1 = new GrandFather();
        Father f1 = new Father();
        Son s1 = new Son();
        g1.display("Tea");
        f1.display("Green", "Tea");
        s1.display("Swedish", "Green", "Tea");
    }
}

class GrandFather {

    void display(String Tea) {
        System.out.println("Grandfather loved:" + Tea);
    }

}

class Father extends GrandFather {

    void display(String Type, String Tea) {
        System.out.println("Father loved:" + Type + " " + Tea);
    }
}

class Son extends Father {

    void display(String From, String Type, String Tea) {
        System.out.println("Son loved:" + From + " " + Type + " " + Tea);
    }
}