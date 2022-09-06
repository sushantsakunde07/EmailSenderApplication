package com.bridgelabz.emailsenderapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
    @Autowired
    private EmailSenderService emailSenderService;

    public static void main(String[] args) {
        SpringApplication.run(EmailSenderApplication.class, args);
        System.out.println("Welcome to Email Sender Application..!");
    }

    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        emailSenderService.sendEmail("sushantsakunde07@gmail.com",
                "This is SUBJECT",
                "This is BODY of Email ");
    }
}