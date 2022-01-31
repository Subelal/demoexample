package com.example.demo.factory.calebil;

import com.example.demo.factory.calebil.repository.Plan;

public class InstitutionalPlan extends Plan {
    @Override
    protected void getRate() {
        rate =5.50;
        System.out.println("The rate of InstitutionalPlan per unit is :"+rate);
    }
}
