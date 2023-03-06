package com.example.springannotationsdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class HappyFortuneService implements FortuneService {
    @Value("${random.Fortune.array}")
    private List<String> fortunes;

    @Override
    public String getFortune() {
        this.fortunes = List.of((fortunes.get(0).split(",")));
        //return random index in range of fortune
        return fortunes.get((int) (Math.random() * fortunes.size()));
    }
}
