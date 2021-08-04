package com.training.spring.person.mappings;

import java.util.Set;

import com.training.spring.person.model.Person;
import com.training.spring.person.services.Address;
import com.training.spring.person.services.PersonDTO;
import com.training.spring.person.services.PersonDetails;
import com.training.spring.person.services.Phone;

public class PersonMapping {

    public static PersonDTO personToDTO(final Person person) {
        PersonDTO personDTOLoc = new PersonDTO();
        personDTOLoc.setHeight(person.getHeight());
        personDTOLoc.setWeight(person.getWeight());
        personDTOLoc.setName(person.getName());
        personDTOLoc.setSurname(person.getSurname());
        PersonDetails detailsLoc = new PersonDetails();
        detailsLoc.setGender(person.getGender());
        detailsLoc.setNote(person.getNote());
        personDTOLoc.setPersonDetails(detailsLoc);
        Address addressLoc = person.getAddress();
        addressLoc.setPerson(personDTOLoc);
        personDTOLoc.setAddress(addressLoc);
        Set<Phone> phonesLoc = person.getPhones();
        for (Phone phoneLoc : phonesLoc) {
            phoneLoc.setPerson(personDTOLoc);
        }
        personDTOLoc.setPhones(phonesLoc);
        return personDTOLoc;
    }

    public static Person DTOToPerson(final PersonDTO personDTOParam) {
        Person personLoc = new Person();
        personLoc.setHeight(personDTOParam.getHeight());
        personLoc.setWeight(personDTOParam.getWeight());
        personLoc.setName(personDTOParam.getName());
        personLoc.setSurname(personDTOParam.getSurname());
        personLoc.setGender(personDTOParam.getPersonDetails()
                                          .getGender());
        personLoc.setNote(personDTOParam.getPersonDetails()
                                        .getNote());
        personLoc.setAddress(personDTOParam.getAddress());
        personLoc.setPhones(personDTOParam.getPhones());
        return personLoc;
    }
}
