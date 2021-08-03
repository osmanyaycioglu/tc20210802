package com.training.spring.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class MyFirstRest {

    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/xyz")
    public String hello() {
        return "Hello world GET";
    }

    @PostMapping("/xyz")
    public String hello2() {
        return "Hello world POST";
    }

    @PutMapping("/xyz")
    public String hello3() {
        return "Hello world PUT";
    }

    @DeleteMapping("/xyz")
    public String hello4() {
        return "Hello world DELETE";
    }

    @PatchMapping("/xyz")
    public String hello5() {
        return "Hello world PATCH";
    }

    @RequestMapping(value = "/xyz", method = RequestMethod.OPTIONS)
    public String hello6() {
        return "Hello world OPTIONS";
    }

}
