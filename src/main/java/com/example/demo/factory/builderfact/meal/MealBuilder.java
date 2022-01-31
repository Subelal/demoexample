package com.example.demo.factory.builderfact.meal;

import com.example.demo.factory.builderfact.burger.Burger;
import com.example.demo.factory.builderfact.burger.NonVegBurger;
import com.example.demo.factory.builderfact.burger.VegBurger;
import com.example.demo.factory.builderfact.colddrink.Coke;
import com.example.demo.factory.builderfact.colddrink.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal(){

        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public  Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new NonVegBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

}
