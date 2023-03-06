package com.example.springannotationsdemo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    FortuneService fortuneService;
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside default constructor");
    }
    @PostConstruct
    public void doSomeStartUpStuff() {
        System.out.println(">> TennisCoach: inside doSomeStartUpStuff() method");
    }
    @PreDestroy
    public void doSomeCleanUpStuff() {
        System.out.println(">> TennisCoach: inside doSomeCleanUpStuff() method");
    }
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService=fortuneService;
//    }
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside setFortuneService() method");
        this.fortuneService = fortuneService;
    }
    @Autowired
    @Qualifier("happyFortuneService")
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
    public String GiveFortune() {
        return fortuneService.getFortune();
    }
}
