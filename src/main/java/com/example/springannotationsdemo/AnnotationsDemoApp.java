package com.example.springannotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AnnotationsDemoApp {
    public static void main (String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(theCoach.GiveFortune());
        context.close();
    }
}
