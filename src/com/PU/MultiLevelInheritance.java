package com.PU;

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
    String tea;

    void display(String tea) {
        System.out.println("Grandfather loved:" + tea);
    }

}

class Father extends GrandFather {
    String type;

    void display(String type, String loved) {
        System.out.println("Father loved:" + type + " " + loved);
    }
}

class Son extends Father {
    String type;

    void display(String from, String type, String loved) {
        System.out.println("Son loved:" + from + " " + type + " " + loved);
    }
}