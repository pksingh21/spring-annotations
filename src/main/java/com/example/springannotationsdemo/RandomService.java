package com.example.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
    @Override
    public String getFortune() {
        return "Random Fortune Time";
    }
}
