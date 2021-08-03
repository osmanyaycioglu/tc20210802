package com.training.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.IHello;

@RestController
@RequestMapping("/greet")
public class GreetingRest {

    @Qualifier("DYN")
    @Autowired
    private IHello helloOp;

    @GetMapping("/hello/{abc}/{xyz}")
    public String hello(@PathVariable("abc") final String name,
                        @PathVariable("xyz") final String surname) {
        return "1: " + this.helloOp.sayHello(name + " " + surname);
    }

    @GetMapping("/hello2")
    public String hello2(@RequestParam("abc") final String name,
                         @RequestParam("xyz") final String surname) {
        return "2: " + this.helloOp.sayHello(name + " " + surname);
    }

    @GetMapping("/hello3")
    public String hello3(@RequestHeader("abc") final String name,
                         @RequestHeader("xyz") final String surname) {
        return "3: " + this.helloOp.sayHello(name + " " + surname);
    }

    @PostMapping("/hello4")
    public String hello4(@RequestBody final GreetingInput gi) {
        return "3: " + this.helloOp.sayHello(gi.getName() + " " + gi.getSurname() + " " + gi.getAge());
    }


}
