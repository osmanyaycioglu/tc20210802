package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class RunSpring {

    public static void main(final String[] args) {
        //        Hello helloLoc = new Hello();
        //        Greeting greetingLoc = new Greeting(helloLoc);
        //        greetingLoc.greet("osman");

        Class<NodeNotifyApplication> spClazz = NodeNotifyApplication.class;
        ConfigurableApplicationContext context = SpringApplication.run(spClazz,
                                                                       args);
        Greeting beanLoc = context.getBean(Greeting.class);
        beanLoc.greet("osman");
        Greeting beanLoc2 = (Greeting) context.getBean("greeting");
        beanLoc2.greet("osman");

    }
}
