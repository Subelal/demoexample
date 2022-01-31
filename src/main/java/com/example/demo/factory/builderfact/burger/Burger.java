package com.example.demo.factory.builderfact.burger;

import com.example.demo.factory.builderfact.Item;
import com.example.demo.factory.builderfact.Packing;
import com.example.demo.factory.builderfact.packing.Wrapper;


public abstract class Burger implements Item {
   @Override
    public Packing packing(){
       return new Wrapper();
   }

   @Override
    public abstract float price();
}
