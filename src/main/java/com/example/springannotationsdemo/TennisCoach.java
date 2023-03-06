package com.example.springannotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    FortuneService fortuneService;
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService=fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    public String GiveFortune() {
        return fortuneService.getFortune();
    }
}
