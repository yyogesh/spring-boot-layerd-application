package com.example.SpringBootApplication.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmsNotification implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Send notification by sms");
    }
}
