package com.training.spring.person.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.person.mappings.PersonMapping;
import com.training.spring.person.model.Person;
import com.training.spring.person.services.PersonManagService;

@RestController
@RequestMapping("/api/v1/person/management")
public class PersonController {

    @Autowired
    private PersonManagService personService;

    @PostMapping("/add")
    public String add(final Person person) {
        this.personService.add(PersonMapping.personToDTO(person));
        return "SUCCESS";
    }


}
