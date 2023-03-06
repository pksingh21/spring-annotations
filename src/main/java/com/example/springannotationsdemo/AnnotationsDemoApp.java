package com.example.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
    public static void main (String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(theCoach.GiveFortune());
        context.close();
    }
}
