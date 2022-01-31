package com.example.demo.java8;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        gamesList.add("AHocky");
        System.out.println("------------Iterating by passing lambda expression--------------");

//      /  val append = System.out::append;
//        val hashCode = System.out::hashCode;
        gamesList.stream().forEachOrdered(obj-> System.out.println(obj));
    }
}
