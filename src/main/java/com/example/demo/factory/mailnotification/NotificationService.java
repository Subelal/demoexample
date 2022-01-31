package com.example.demo.factory.mailnotification;

public class NotificationService<notification> {
    public Integer i = 10;
    public static void main(String[] args) {
         int i = 10;

        NotificationFactory notificationFactory =
                new NotificationFactory();
        Notification notification = notificationFactory.createNotification("email");
        notification.notifyUser();

    }



}
