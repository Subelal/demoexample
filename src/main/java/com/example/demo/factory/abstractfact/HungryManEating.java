package com.example.demo.factory.abstractfact;

public class HungryManEating {

    public static void main(String[] args) {
        Hotel hungaryMan = HungaryMan.getMeal(true);
        Halwai h1 = hungaryMan.getVegMeal("roti");
        h1.halwai();
        Halwai h2 = hungaryMan.getNonVegMeal("murga");
        h2.halwai();
    }
}
