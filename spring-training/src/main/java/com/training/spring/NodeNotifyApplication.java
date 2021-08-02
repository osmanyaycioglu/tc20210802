package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NodeNotifyApplication implements ApplicationRunner {

    @Autowired
    private Greeting greeting;

    @Autowired
    private Greeting greeting2;

    @Autowired
    private Greeting greeting3;

    @Autowired
    @Qualifier("helloTr")
    private IHello   het;

    @Autowired
    @Qualifier("ENG")
    private IHello   hee;

    @Autowired
    private IHello   helloEsp;

    @Autowired
    @Qualifier("DYN")
    private IHello   hhp;

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.greeting.greet("osman1");
        this.greeting2.greet("osman2");
        this.greeting3.greet("osman3");
        System.out.println(this.het.sayHello("test TR"));
        System.out.println(this.hee.sayHello("test TR"));
        System.out.println(this.helloEsp.sayHello("test TR"));
        System.out.println(this.hhp.sayHello("test TR"));
    }

}
