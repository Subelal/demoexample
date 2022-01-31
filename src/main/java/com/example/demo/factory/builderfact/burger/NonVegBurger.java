package com.example.demo.factory.builderfact.burger;

public class NonVegBurger extends Burger{
    @Override
    public String name() {
        return "Non VegBurger";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
