package com.example.demo.factory.calebil;

import com.example.demo.factory.calebil.repository.Plan;

public class CommercialPlan extends Plan {
    @Override
    protected void getRate() {
        rate = 7.50;
        System.out.println("The rate of CommercialPlan per unit is :"+rate);
    }
}
