package com.example.demo.factory.calebil.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();
//        System.out.println(" Enter the name of plan for which the bill will be generated");
//        BufferedReader bufferedReader =
//                    new BufferedReader(new InputStreamReader(System.in));
//
//        String planName = bufferedReader.readLine();

//        System.out.println(" Enter the number of units for bill will be calculated: ");


//        int units = Integer.parseInt(bufferedReader.readLine());
        int a = 3;
        int units = a;
        String planName ="COMM";
        Plan p = planFactory.getPlan(planName);



        p.getRate();
        p.calculateBill(units);
//        private int cal(){
//            p.calculateBill(units);
//        }

        System.out.println("Bill amount for "+planName+" of "+units+" unit is: ");

    }
}
