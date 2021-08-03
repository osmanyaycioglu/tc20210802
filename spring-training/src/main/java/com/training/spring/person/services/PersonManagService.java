package com.training.spring.person.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.person.data.PersonStorage;

@Service
public class PersonManagService {

    @Autowired
    private PersonStorage ps;

    public void add(final PersonDTO person) {
        this.ps.add(person);
    }

}