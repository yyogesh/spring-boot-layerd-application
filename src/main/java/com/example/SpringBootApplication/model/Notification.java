package com.example.SpringBootApplication.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    private String name;
    private int id;
    Message message;

    public void sendNotification() {
        message.sendMessage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message getMessage() {
        return message;
    }

    @Autowired
    public void setMessage(Message message) {
        this.message = message;
    }
}
