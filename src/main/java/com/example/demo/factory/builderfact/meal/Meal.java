package com.example.demo.factory.builderfact.meal;

import com.example.demo.factory.builderfact.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> ListItems = new ArrayList<Item>();

    public void addItem(Item item){
        ListItems.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : ListItems){
            cost +=item.price();


        }
        return cost;
    }


    public  void showItem(){
        for (Item item: ListItems){
            System.out.print("Item :"+ item.name());
            System.out.print(" , Packing  :"+ item.packing().pack());
            System.out.print(" , Cost :"+ item.price());
        }
    }
}
