package com.training.spring.person.data;

import org.springframework.data.repository.CrudRepository;

import com.training.spring.person.services.Phone;

public interface IPhoneDao extends CrudRepository<Phone, Long> {

}
