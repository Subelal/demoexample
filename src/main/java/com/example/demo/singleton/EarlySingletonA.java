package com.example.demo.singleton;

public class EarlySingletonA {

    private static EarlySingletonA earlySingletonA =
            new EarlySingletonA();

    private EarlySingletonA() {
    }

    public static EarlySingletonA getEarlySingletonA(){

        return earlySingletonA;
    }

    public void doSomething(){
        int a,b,c;
        a=5;
        b=6;
        c = a+b;
        System.out.println("Addition with singleton early : "+c);

    }

    public static void main(String[] args) {

        EarlySingletonA.getEarlySingletonA().doSomething();

        earlySingletonA.doSomething();
    }
}
