package com.example.demo.thread;

import java.util.stream.Stream;

public class Logic {

    public static void main(String[] args) {
//        String s2 ="abcd";
//        reverseString(s2);
        final double d = 5 / 2;
        System.out.println(d);

           }
    private static String reverseString(String str){
        String s1 = str;
        String s2 ="";
        char ch[] = s1.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
//            s2 += String.valueOf(ch[i]);
            s2 +=s1.charAt(i);
        }

        System.out.println(s1);
        System.out.println(s2);
        return s2;
    }

    public static void fact(int factNum){
        int fact =1;
        for(int i=factNum;i>=1;i--){
            fact= fact*i;
        }
        System.out.println(fact);

        Stream s;
    }
    public static void fib(int num){

        int temp=0;
        int start=0;
        int prev,next=1;
            for(int i =1;i<=num;i++){

                //temp = ;
               prev = start+next;
                System.out.println(prev);
               start =next;
               next =prev;



            }
    }

    public static  void palindrom(String str){
        String s1 = str;
        String s3 =null;

        char[] ch = s1.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            s3 += String.valueOf(s1.charAt(i));
            // +=ch[i];
        }
        System.out.println(" reverse char "+s3);
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        String s2 =sb.reverse().toString();
        System.out.println("Reverse  "+ s2);

        if(s1.equals(s3)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
