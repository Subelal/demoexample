package com.example.demo.factory.mailnotification;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("sending a push notification ");
    }
}
