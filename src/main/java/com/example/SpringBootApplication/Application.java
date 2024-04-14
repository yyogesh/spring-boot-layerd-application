package com.example.SpringBootApplication;

import com.example.SpringBootApplication.model.EmailNotification;
import com.example.SpringBootApplication.model.Notification;
import com.example.SpringBootApplication.service.NotificationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
//		Notification notification = context.getBean(Notification.class);
//		notification.sendNotification();

		NotificationService service = context.getBean(NotificationService.class);
		EmailNotification emailNotification = context.getBean(EmailNotification.class);
		service.saveNotification(emailNotification);
	}
}
