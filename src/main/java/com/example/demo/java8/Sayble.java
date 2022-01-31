package com.example.demo.java8;

public interface Sayble {

    default void say(){
        System.out.println("Hello, this is default method");
    }
    void sayMore(String str);

    static void sayLouder(String str){
        System.out.println(" static method that say Louder ");
    }
}
