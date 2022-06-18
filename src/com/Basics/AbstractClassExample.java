package com.Basics;


abstract class Truck {
    Truck() {
        System.out.println("Truck constructor created.");
    }

    abstract void run();
}

class Volvo extends Truck {
    void run() {
        System.out.println("Running at economy speed.");
    }
}

class Test {

    public static void main(String[] args) {
        Truck truck = new Volvo();
        truck.run();
    }
}
