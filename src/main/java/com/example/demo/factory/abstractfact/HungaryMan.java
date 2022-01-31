package com.example.demo.factory.abstractfact;

public class HungaryMan {

   public static Hotel getMeal(boolean available){
       if(available){
           return  new Bazaar();
       }

       return null;
   }
}
