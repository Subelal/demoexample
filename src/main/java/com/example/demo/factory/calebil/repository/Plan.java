package com.example.demo.factory.calebil.repository;

public abstract class Plan   {
    protected double rate;
    protected abstract void getRate();

    public void calculateBill(int unit){
        System.out.println("The bill amt is  :  "+rate*unit);

       // return (rate*unit);
    }
}
