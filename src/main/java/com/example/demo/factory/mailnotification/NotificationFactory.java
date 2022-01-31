package com.example.demo.factory.mailnotification;

public class NotificationFactory {

    public Notification createNotification(String channel){

        if(channel == null && channel.isEmpty()){
            return null;
        }
        if("SMS".equalsIgnoreCase(channel)){
            return new SMSNotification();
        }else if ("email".equalsIgnoreCase(channel)){
            return new EmailNotification();
        }else if("push".equalsIgnoreCase(channel)){
            return new PushNotification();
        }
        return null;
    }
}
