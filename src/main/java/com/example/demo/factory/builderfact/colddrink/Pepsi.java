package com.example.demo.factory.builderfact.colddrink;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
