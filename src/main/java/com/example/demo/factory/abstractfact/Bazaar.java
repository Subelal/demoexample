package com.example.demo.factory.abstractfact;

public class Bazaar extends Hotel{

    @Override
   public Halwai getVegMeal(String vegkhana) {

        if(vegkhana == null && vegkhana.isEmpty()){
            return null;
        }
        if ("roti".equalsIgnoreCase(vegkhana)){

            return new Roti();
        }else if ("daal".equalsIgnoreCase(vegkhana)){
            return new Daal();
        }else if("sabji".equalsIgnoreCase(vegkhana)){
            return new Sabji();
        }

        return null;
    }

    @Override
    public Halwai getNonVegMeal(String vegkhana) {
        if(vegkhana == null && vegkhana.isEmpty()){
            return null;
        }
        if("roti".equalsIgnoreCase(vegkhana)){
            return new Roti();
        }else if("murga".equalsIgnoreCase(vegkhana)){
            return new Murga();
        }
        return null;
    }
}
