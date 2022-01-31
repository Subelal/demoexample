package com.example.demo.sorting;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.T;

class Student {

    int rollNo;
    String name;
    int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

     static class StudentSortingComparator implements Comparator<Student>{

         @Override
         public int compare(Student st1, Student st2) {

             int ageSort= st1.age- st2.age;
             int NameSort = st1.name.compareTo(st2.name);
             return (NameSort == 0)?ageSort
                                  :NameSort ;
         }
     }
}

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student st1, Student st2) {
//        if(st1.age == st2.age){
//            return 0;
//        }else if(st1.age> st2.age){
//            return 1;
//        }
//        else
//            return -1;
        return st1.age- st2.age;
    }
}

class NameComprator implements Comparator<Student>{

    @Override
    public int compare(Student st1, Student st2) {

        return st1.name.compareTo(st2.name);
    }
}
public class TestSort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(105, "dabalu", 30));
        list.add(new Student(106, "babalu", 32));
        list.add(new Student(107, "pavan", 35));
        list.add(new Student(101, "sonu", 23));
        list.add(new Student(102, "soni", 24));
        list.add(new Student(103, "sube", 23));
        list.add(new Student(104, "anchal", 25));

        System.out.println(list.size());

         List<Student> distinctStudentList =
                    list.stream()
                            .distinct()
                            .sorted((obj1,obj2)-> obj2.name.compareTo(obj1.name))
                            .collect(Collectors.toList());

        System.out.println(distinctStudentList);

        for (Student st : distinctStudentList){
            System.out.println(st);
        }
        



    }
}
