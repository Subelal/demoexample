package com.example.demo.factory.mailnotification;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Sending an sms notification ");
    }
}
