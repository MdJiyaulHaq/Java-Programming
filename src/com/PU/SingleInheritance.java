package com.PU;

public class SingleInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.get(55000.05f);
        Programmer p1 = new Programmer();
        p1.get(78692, 7860);
    }
}

class Employee {
    float salary;

    void get(float salary) {
        this.salary = salary;
        System.out.println("The salary is:" + salary);
    }
}

class Programmer extends Employee {
    int bonus;

    void get(float salary, int bonus) {
        this.bonus = bonus;
        System.out.println("The salary and bonus is:" + salary + "  " + bonus);
    }
}

