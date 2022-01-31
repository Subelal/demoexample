package com.example.demo.java8;

public class DefaultMethod implements Sayble{


    @Override
    public void sayMore(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        DefaultMethod d = new DefaultMethod();
        d.sayMore("abstract method from interface ");
        d.say();
        Sayble.sayLouder("By sube");
    }
}
