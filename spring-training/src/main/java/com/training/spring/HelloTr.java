package com.training.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TR")
public class HelloTr implements IHello {

    public HelloTr() {
    }

    @Override
    public String sayHello(final String name) {
        return "Merhaba " + name;
    }

}
