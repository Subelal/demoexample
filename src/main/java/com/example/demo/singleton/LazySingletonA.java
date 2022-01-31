package com.example.demo.singleton;

public class LazySingletonA {

    private  static LazySingletonA lazySingletonA;

    private LazySingletonA(){

    }

    public static LazySingletonA getLazySingletonA(){

        if(lazySingletonA==null){
            synchronized (LazySingletonA.class){
                if(lazySingletonA == null){
                    lazySingletonA = new LazySingletonA();
                }
            }
        }

        return lazySingletonA;
    }

    public void doSomething(){
        int a,b,c;
        a=5;
        b=6;
        c = a+b;
        System.out.println("Addition with singleton early : "+c);

    }

    public static void main(String[] args) {
        lazySingletonA.doSomething();
        LazySingletonA.getLazySingletonA().doSomething();
    }
}
