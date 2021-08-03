package com.training.spring.person.mappings;

import com.training.spring.person.model.Person;
import com.training.spring.person.services.PersonDTO;

public class PersonMapping {

    public static PersonDTO personToDTO(final Person person) {
        PersonDTO personDTOLoc = new PersonDTO();
        personDTOLoc.setHeight(person.getHeight());
        personDTOLoc.setWeight(person.getWeight());
        personDTOLoc.setName(person.getName());
        personDTOLoc.setSurname(person.getSurname());
        return personDTOLoc;
    }
}
