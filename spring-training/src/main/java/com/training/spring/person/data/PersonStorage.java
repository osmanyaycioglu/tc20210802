package com.training.spring.person.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.training.spring.person.services.PersonDTO;

@Service
public class PersonStorage {

    private final Map<String, PersonDTO> personMap = new ConcurrentHashMap<>();

    public void add(final PersonDTO person) {
        this.personMap.put(person.getName() + "_" + person.getSurname(),
                           person);
    }

}
