package com.training.spring.person.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.person.mappings.PersonMapping;
import com.training.spring.person.model.Person;
import com.training.spring.person.services.PersonDTO;
import com.training.spring.person.services.PersonManagService;

@RestController
@RequestMapping("/api/v1/person/management")
public class PersonController {

    @Autowired
    private PersonManagService personService;

    @PostMapping("/add")
    public String add(@Validated @RequestBody final Person person) {
        this.personService.add(PersonMapping.personToDTO(person));
        return "SUCCESS";
    }

    @GetMapping("/search/by/name")
    public List<Person> getPersonByName(@RequestParam("name") final String name) {
        List<PersonDTO> searchByNameLoc = this.personService.searchByName(name);
        List<Person> personL = new ArrayList<>();
        for (PersonDTO personDTOLoc : searchByNameLoc) {
            personL.add(PersonMapping.DTOToPerson(personDTOLoc));
        }
        return personL;
    }


}
