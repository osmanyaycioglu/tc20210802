package com.training.spring.person.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

    public List<PersonDTO> searchByName(final String nameParam) {
        List<PersonDTO> personList = new ArrayList<>();
        Collection<PersonDTO> valuesLoc = this.personMap.values();
        for (PersonDTO personDTOLoc : valuesLoc) {
            if (nameParam.equals(personDTOLoc.getName())) {
                personList.add(personDTOLoc);
            }
        }
        return personList;
    }

}
