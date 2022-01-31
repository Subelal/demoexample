package com.example.demo.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {

    static int count = 1;
    static int choice;

    public static void main(String[] args) throws IOException {
        JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();
         try {
             System.out.println("Call ble started");
             jdbcSingleton.callbleStatment();
             System.out.println("callable stopped ");
         }catch (Exception ex){
             ex.printStackTrace();
         }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("DATABASE OPERATIONS");
            System.out.println("-----------------------");
            System.out.println("1. Insertion  ");
            System.out.println("2. View By Name");
            System.out.println("3. Delete ");
            System.out.println("4. Update  ");
            System.out.println("5. View all the records ");
            System.out.println("6. Exit  ");
            System.out.print("\n");
            System.out.print("Please enter your choice what you want to perform in the database ");
            choice = Integer.parseInt(br.readLine());

            switch (choice){
                case 1: {
                    System.out.print("Enter the username: ");
                    String username = br.readLine();
                    System.out.print("Enter the password: ");
                    String password = br.readLine();

                    try{
                        int i = jdbcSingleton.insert(username,password);
                        if(i > 0){
                            System.out.println((count++)+" Data has been inserted successfully ");
                        }else{
                            System.out.println(" Data has not been inserted ");
                        }

                    }catch (Exception ex){
                        ex.printStackTrace();
                    }

                    System.out.println(" Plz Enter key to continue ");
                    System.in.read();
                }
                break;
                case 2:{
                    System.out.print(" Please enter username: ");
                    String username = br.readLine();
                    try{
                        jdbcSingleton.getDataByName(username);

                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Press enter key to continue ");
                    System.in.read();
                }
                break;
                case 3:{
                    System.out.print(" Enter the userid , you want to delete: ");
                    int userid = Integer.parseInt(br.readLine());
                    try{
                        int deleteRecord = jdbcSingleton.delete(userid);
                        if(deleteRecord >0){
                            System.out.println((count++) +" Data has been deleted successfully ");
                        }else{
                            System.out.println("Data has not been deleted ");
                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Press Enter key to continue ");
                    System.in.read();
                }
                break;
                case 4:{
                    System.out.print(" Enter username you want to update: ");
                    String username = br.readLine();
                    System.out.print(" Enter the the password: ");
                    String password = br.readLine();

                    try{
                      int deleteRecord = jdbcSingleton.update(username,password);
                      if(deleteRecord >0){
                          System.out.println(" Data has been updated successfully ");
                      }else{
                          System.out.println(" Data has not been updated ");
                      }

                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Press Enter key to continue...");
                    System.in.read();
                }
                break;
                case 5:{
                    System.out.println(" Get All the records");
//                    String username = br.readLine();
                    try{
                        jdbcSingleton.getAllData();

                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    System.out.println("Press enter key to continue ");

                    System.in.read();
                }
                break;
                default:
                    return;


            }
        }while (choice != 5);

    }
}
