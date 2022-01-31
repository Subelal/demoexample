package com.example.demo.java8;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[5]="This is important";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[5]);
        System.out.println(value);

        String s = "Filtered Value "+value.filter((s1)->s1.equals("ABC"));
        System.out.println(s);
String s3 = "Filtered Value "+value.filter((s1)->s1.equals("This is important"));
        System.out.println(s3);

        System.out.println("Get : "+value.get());
        System.out.println("Get Hash Code: "+value.hashCode());


        System.out.println("Get is Value Present: "+value.isPresent());
        System.out.println(Optional.ofNullable(str[5]));
        Optional<String> value2 = Optional.of(str[5]);
        System.out.println(value2.orElse("Value is not present"));
//        empty.orElse("Value is not present")
//
        System.out.println(empty.orElse("Value is not present"));


        value.ifPresent(System.out::println);





//        Optional<String> checkNull = Optional.ofNullable(str[5]);
//        checkNull.ifPresent(System.out::println);
//        System.out.println(checkNull.get());
//        System.out.println(str[5].toUpperCase());

//        if (checkNull.isPresent()){
//            String lowercaseString = str[5].toLowerCase();
//            System.out.println(lowercaseString);
//        }else{
//            System.out.println("String value is not present ");
//        }

    }
}
