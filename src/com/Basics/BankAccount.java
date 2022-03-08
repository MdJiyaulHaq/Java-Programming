package com.Basics;

public class BankAccount {
    int account_number;
    String name;
    float balance;

    public static void main(String[] args) {
        BankAccount A1 = new BankAccount();
        A1.put_account_info(3853959, "Md", 78692);
        A1.Account_info();
        A1.balance_inquiry();
        A1.deposit(45);
        A1.balance_inquiry();
        A1.withdraw(46);
        A1.balance_inquiry();
    }

    // account creation function
    void put_account_info(int account_number, String name, float balance) {
        this.account_number = account_number;
        this.name = name;
        this.balance = balance;
    }

    // account information
    void Account_info() {
        System.out.println(account_number);
        System.out.println(name);
        System.out.println(balance);
    }

    // deposit amount
    void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Balance Deposited:");
    }

    // withdraw amount
    void withdraw(float amount) {
        if (balance == 0 || balance < amount) {
            System.out.println("Insufficient balance:");
        } else {
            balance = balance - amount;
        }
    }

    // balance inquiry
    void balance_inquiry() {
        System.out.println("Your balance is :" + balance);
    }

}
