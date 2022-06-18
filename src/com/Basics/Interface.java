package com.Basics;

public class Interface {
    public static void main(String[] args) {
        Bank bank1 = new Nabil();
        Bank bank2 = new NRB();
        System.out.println(bank1.ROI());
        System.out.println(bank2.ROI());
    }

    interface Bank {
        float ROI();
    }

    static class NRB implements Bank {
        public float ROI() {
            return (float) 8.3;
        }

    }

    static class Nabil implements Bank {
        public float ROI() {
            return (float) 7.8;
        }

    }

}
