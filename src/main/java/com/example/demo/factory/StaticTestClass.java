package com.example.demo.factory;

class Student{
    int rollNo;
    String name;
    static String collegeName ="Nirmala";

    public Student() {
    }

    static void change(){
        collegeName="mittal";
    }
    Student(int rn, String nm){
        this.rollNo = rn;
        this.name = nm;
    }
   void display(){
       System.out.println(rollNo+"  "+name+"  "+collegeName);
   }
//    @Override
//    public String toString() {
//        return "Student{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                '}';
//    }
}

public class StaticTestClass {


    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        String s3 = new String("a");
        System.out.println("s1: "+s1.hashCode());
        System.out.println("s2: "+s2.hashCode());
        System.out.println("s3: "+s3.hashCode());

         }

}
