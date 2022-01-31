package com.example.demo.factory.calebil;

import com.example.demo.factory.calebil.repository.Plan;


public class DomesticPlan extends Plan {
    @Override
    protected void getRate() {
        rate=3.50;
        System.out.println("The rate of DomesticPlan per unit is :"+rate);
    }
}
