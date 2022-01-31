package com.example.demo.java8;

abstract class AbstractClass{
    public AbstractClass() {
        System.out.println(" This is abstract class :Constructor ");
    }

    abstract int add(int a , int b);
    int sub(int a, int b){
        return a-b;
    }
    static int multiple(int a,int b){
        return a*b;
    }
}

public class AbstractTest extends AbstractClass {
    @Override
    int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a=5,b=6;
        AbstractTest at = new AbstractTest();
        int result = at.add(a,b);
        int result1 = at.sub(a,b);
        int result3 = AbstractClass.multiple(a,b);
        System.out.println(" Addition "+result);
        System.out.println(" Subtraction "+result1);
        System.out.println(" Multiplication "+result3);
    }

}
