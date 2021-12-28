package com.Basics;

public class StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student(99, "Shankar");
        Student s11 = new Student(90, "Hari");
        s1.display();
        s11.display();

        /* this will count the objects of Counter created. */
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // changing the static variable
        Static_Changer.Change();
        Static_Changer sc = new Static_Changer(3, "Zalima");
        sc.display();

    }

    static class Student {
        static int sem = 3;
        int roll;
        String name;

        Student(int roll, String name) {
            this.roll = roll;
            this.name = String.valueOf(name);
        }

        void display() {
            System.out.println(name + " " + roll + " " + sem);
        }
    }

    public static class Counter {
        static int count = 0;

        Counter() {
            count++;
            System.out.println(count);
        }
    }

    static class Static_Changer<Static> {
        static String college = "NCIT";
        int roll;
        String name;

        Static_Changer(int roll, String name) {
            this.roll = roll;
            this.name = String.valueOf(name);
        }

        static void Change() {
            college = "PU";
        }

        void display() {
            System.out.println(name + " " + roll + " " + college);
        }
    }
}

