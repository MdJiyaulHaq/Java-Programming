package com.PU;

public class MethodParameters {
    static void myMethod(String name, int roll)
    {
        System.out.println("The name of student is: "+name+".\n And his roll number is: "+roll);
    }
    static char myMethod2(char character)
    {
        return character;
    }
    static int myMethod3(int x, int y)
    {
        return x+y;
    }
    static int myMethod4(int age)
    {
        if (age<18){
            System.out.println("you are not 18+ to play this game.");
        }
        else {
            System.out.println("please wait, loading the game.");
        }
        return age;
    }

    public static void main(String[] args) {
        myMethod("Md", 15);
        myMethod("Mausam", 14);
        myMethod("Miamsha", 16);
        myMethod("Mandip", 17);

        System.out.println("The character you passed is: "+myMethod2('M'));

        System.out.println("The sum of two integers is: "+myMethod3(4,6));

        myMethod4(22);
    }
}

