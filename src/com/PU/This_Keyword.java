package com.PU;

public class This_Keyword {

    static class Testing_Student {
        public static void main(String[] args) {
            Student s1 = new Student(15, "Md");
            s1.get();
            Student s2 = new Student(14, "Khan", 3);
            s2.get();
        }
    }

    static class Testing_Employee {
        public static void main(String[] args) {
            Employee e1 = new Employee();
            e1.Emp();
        }
    }

    // The This () constructor call should be used to reuse the constructor from the constructor.
    // It maintains the chain between the constructors i.e. it is used for constructor chaining
    static class Student {
        int roll;
        String name;
        int sem;

        Student(int roll, String name) {
            this.name = name;
            this.roll = roll;
        }

        Student(int roll, String name, int sem) {
            this(roll, name);  // must be written before any line in the block.
            this.sem = sem;
        }

        void get() {
            System.out.println(name + " " + roll + " " + sem);
        }
    }

    static class Employee {
        void Em(Employee obj) {
            System.out.println(" object e1 from Em method is invoked using Emp method.");
        }

        void Emp() {
            Em(this);
        }
    }
}
