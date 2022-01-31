package com.example.demo.factory.builderfact.colddrink;

import com.example.demo.factory.builderfact.Item;
import com.example.demo.factory.builderfact.Packing;
import com.example.demo.factory.builderfact.packing.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
