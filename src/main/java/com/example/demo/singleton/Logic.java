package com.example.demo.singleton;

public class Logic {
     public static int sequnceNum(long num){
        int count =0;
        long start =1 ;
        long end = (num+1)/2;
         long sum =0;
          while(start < end){

              for (long i =start ;i<=end;i++){
                  sum = sum+i;
                   if (sum == num){
                       count++;
                       System.out.println(sum);
                       System.out.println(count);
                       break;

                   }

              }

              sum =0;
              start++;
          }


                   return count;
     }
    public static void main(String[] args) {

         Logic logic = new Logic();
         int a = sequnceNum(15);
        System.out.println(a);

    }
}
