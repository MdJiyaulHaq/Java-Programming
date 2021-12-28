package com.Basics;

public class SuperKeyword {
    public static void main(String[] args) {
        Ford c = new Ford();
        c.printColor();
        c.type();

        Ford constructor = new Ford();
    }
}

class Car {
    String color = "Any";
    Boolean solar = false;

    Car() {
        System.out.println("car constructor");
    }

    void type() {
        System.out.println(solar);
    }
}

class Ford extends Car {
    String color = "Black";
    Boolean solar = true;

    Ford() {
        super(); // this will invoke parent class constructor.
        System.out.println("Ford constructor");
    }

    void type() {
        System.out.println(super.solar);
        System.out.println(solar);
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
}
