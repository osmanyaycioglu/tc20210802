package com.training.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ESP")
public class HelloEsp implements IHello {

    public HelloEsp() {
    }

    @Override
    public String sayHello(final String name) {
        return "Hola " + name;
    }

}
