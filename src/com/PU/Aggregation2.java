package com.PU;

public class Aggregation2 {
    public static void main(String[] args) {
        Address adder1 = new Address("Nepal", 2, "Dhanusha");
        Address addr2 = new Address("Nepal", 5, "Rupandehi");
        Students s1 = new Students(15, "Md", adder1);
        Students s2 = new Students(25, "Arjun", addr2);
        s1.get();
        s2.get();
    }
}

class Students {
    int roll;
    String name;
    Address address;

    Students(int roll, String name, Address address) {
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    void get() {
        System.out.println("Name is:" + name + ". And roll no. is:" + roll + ".");
        System.out.println("Address is:" + address.country + ", State no:" + address.state + ", District:" + address.district);
    }
}

class Address {
    String country;
    int state;
    String district;

    public Address(String country, int state, String district) {
        this.country = country;
        this.state = state;
        this.district = district;
    }
}