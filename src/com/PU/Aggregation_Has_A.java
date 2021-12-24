package com.PU;

// if the relation is strong then it will be called
// Composition rather than Aggregation.
public class Aggregation_Has_A {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.area(4));
    }
}

class Calculation {
    int square(int radius) {
        return radius * radius;
    }
}

class Circle {
    Calculation c = new Calculation();
    float pi = (float) 3.14;

    int area(int radius) {
        int r2 = c.square(radius);
        return r2;
    }
}
