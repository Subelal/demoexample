package com.example.demo.factory.calebil.repository;

import com.example.demo.factory.calebil.CommercialPlan;

import com.example.demo.factory.calebil.DomesticPlan;
import com.example.demo.factory.calebil.InstitutionalPlan;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if(planType.equalsIgnoreCase("DM")){

            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("COMM")){
             return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("INS")){
            return new InstitutionalPlan();
        }

        return null;
    }
}
