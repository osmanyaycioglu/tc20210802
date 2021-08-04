package com.training.spring.person.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.person.data.IPersonDao;

@Service
public class PersonManagService {

    @Autowired
    private IPersonDao personDao;

    public void add(final PersonDTO person) {
        this.personDao.save(person);
    }

    public List<PersonDTO> searchByName(final String nameParam) {
        return this.personDao.findByName(nameParam);
    }

}
