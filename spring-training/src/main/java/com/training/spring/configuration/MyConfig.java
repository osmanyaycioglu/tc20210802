package com.training.spring.configuration;

import java.util.Random;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.Hello;
import com.training.spring.HelloEsp;
import com.training.spring.HelloTr;
import com.training.spring.IHello;

@Configuration
public class MyConfig {

    @Bean
    @Qualifier("DYN")
    public IHello createHello() {
        Random randomLoc = new Random();
        int nextIntLoc = randomLoc.nextInt(3);
        switch (nextIntLoc) {
            case 0:
                return new Hello();
            case 1:
                return new HelloTr();
            case 2:
                return new HelloEsp();
            default:
                return new Hello();
        }
    }

}
