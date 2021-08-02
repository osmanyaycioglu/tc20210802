package com.training.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("ENG")
public class Hello implements IHello {

    public Hello() {
    }

    @Override
    public String sayHello(final String name) {
        return "Hello " + name;
    }

}
