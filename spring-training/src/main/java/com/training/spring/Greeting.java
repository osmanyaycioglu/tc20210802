package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
//@Controller
//@Repository
//@Service
//@Configuration
public class Greeting {

    private int          counter;

    private final IHello hello;

    @Autowired
    public Greeting(@Qualifier("ESP") final IHello helloParam) {
        super();
        this.hello = helloParam;
    }


    public void greet(final String name) {
        String sayHelloLoc = this.hello.sayHello(name);
        this.counter++;
        System.out.println("Greeting  " + this.counter + " : " + sayHelloLoc);
    }

}
