package com.training.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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


    private IHello hhp;

    @Value("${test.prop}")
    private String testProp;

    @Autowired
    public void methodWire(@Qualifier("DYN") final IHello hhp) {
        this.hhp = hhp;
    }

    @PostConstruct
    public void constructDanSonra() {
        System.out.println("NodeNotifyApplication yaratıldı");
    }

    @PreDestroy
    public void destroyDanOnce() {
        System.out.println("NodeNotifyApplication öldürülüyor");
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        System.out.println("****** testProp : " + this.testProp);
        this.greeting.greet("osman1");
        this.greeting2.greet("osman2");
        this.greeting3.greet("osman3");
        System.out.println(this.het.sayHello("test TR"));
        System.out.println(this.hee.sayHello("test TR"));
        System.out.println(this.helloEsp.sayHello("test TR"));
        System.out.println(this.hhp.sayHello("test TR"));
    }

}
