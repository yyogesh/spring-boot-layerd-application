package com.example.SpringBootApplication.model;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Message {
    @Override
    public void sendMessage() {
        System.out.println("Send notification by email");
    }
}
