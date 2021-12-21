package com.PU;

public class Constructors {
    static class Test{
        Test() {
            System.out.println("Test constructor is created.");
        }
    }
    static class Student{
            int roll;
            String name;
        void  display(){
            System.out.println(name +" "+roll);
        }
    }
    static class Student2{
            int roll;
            String name;
            Student2(int roll , String name){
                this.roll=roll;
                this.name= String.valueOf(name);
            }
        void  display(){
            System.out.println(name +" "+roll);
        }
    }
    static class Student3{
        int roll;
        String name;
        int sem;
        Student3(int roll , String name){
            this.roll=roll;
            this.name= String.valueOf(name);
        }
        Student3(int roll , String name, int sem){
            this.roll=roll;
            this.name= String.valueOf(name);
            this.sem=sem;
        }
        void  display(){
            System.out.println(name +" "+roll +" "+ sem);
        }
    }

    public static void main(String[] args) {
        Test t1= new Test(); // default constructor revoked

        // default constructor revoked
        Student s1 = new Student(), s11=new Student();
        s1.display();
        s11.display();

        Student2 s2 = new Student2(15,"Md"), s22=new Student2(14,"Khan");
        s2.display();
        s22.display();

        Student3 s3 = new Student3(99,"Shankar");
        Student3 s33 = new Student3(90, "Hari", 3);
        s3.display();
        s33.display();
    }


}
