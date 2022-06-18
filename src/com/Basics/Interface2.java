package com.Basics;


interface Drawable {
    static int cube(int x) {
        return x * x * x;
    }

    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceStatic {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(4));
    }
}

 