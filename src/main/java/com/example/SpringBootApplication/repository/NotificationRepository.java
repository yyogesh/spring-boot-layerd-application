package com.example.SpringBootApplication.repository;

import com.example.SpringBootApplication.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public class NotificationRepository {
    public void save(Message message) {
        System.out.println("Notification saved in db");
    }

    public void getMessage() {
        System.out.println("Get Notification from db");
    }
}
