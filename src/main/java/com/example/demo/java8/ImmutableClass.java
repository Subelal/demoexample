package com.example.demo.java8;

import java.util.HashMap;
import java.util.Map;

final class Student{
    private final String name;
    final int regNo;
    private final Map<String,String> metaData;



    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String,String> getMetaData1(){

        Map<String,String> tempmap = new HashMap<>();

        for (Map.Entry<String,String> entry:this.metaData.entrySet()){
            tempmap.put(entry.getKey(),entry.getValue());
        }
        return tempmap;
    }


    public Map<String, String> getMetaData() {
        return metaData;
    }

    public Student(String name, int regNo, Map<String, String> metaData) {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                metaData.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metaData = tempMap;
    }
}
public class ImmutableClass {

    public static void main(String[] args) {
        Map<String,String>  map = new HashMap<>();
        map.put("1","first");
        map.put("2","second");

        Student s = new Student("anchal",101,map);

        System.out.println(s.getName());
        System.out.println(s.getRegNo());
//        s.regNo=102;
        System.out.println(s.getRegNo());
        System.out.println(s.getMetaData1());

        map.put("3","Third");
        System.out.println(s.getMetaData1());

    }
}
