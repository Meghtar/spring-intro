package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.getMessage());

        MessageService messageService1 = applicationContext.getBean("messageRandomService", MessageService.class);

        System.out.println(messageService.hashCode());
        System.out.println(messageService1.hashCode());

        System.out.println(messageService1.getMessage());

        applicationContext.close();
    }
}
