package com.example.demo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerExample {

    public static void main(String[] args) {
        StringJoiner joinName = new StringJoiner(",");
        System.out.println(joinName);

//        joinName.setEmptyValue("this is my office");
//        System.out.println(joinName);

        joinName.add("abc");
        joinName.add("xyz");

        System.out.println(joinName);

        int lenString = joinName.length();
        System.out.println(lenString);

        String str = joinName.toString();
        System.out.println(str);

        char ch = str.charAt(1  );
        System.out.println("character at index 2    : "+ch);

    }
}
