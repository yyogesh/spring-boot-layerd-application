package com.example.SpringBootApplication.service;

import com.example.SpringBootApplication.model.Message;
import com.example.SpringBootApplication.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    NotificationRepository notificationRepository;
    public void saveNotification(Message message) {
        //  System.out.println("Save notification Method called");
        notificationRepository.save(message);
    }

    public boolean isNotificationValid(Message message) {
        return true;
    }
}
