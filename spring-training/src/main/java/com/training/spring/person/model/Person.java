package com.training.spring.person.model;

import java.util.Set;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.training.spring.person.services.Address;
import com.training.spring.person.services.EGender;
import com.training.spring.person.services.Phone;

public class Person {

    @NotEmpty
    @Size(min = 2, max = 20, message = "Name 2 ile 20 arasında olmalı")
    private String     name;
    @NotEmpty
    @Size(min = 2, max = 30, message = "Surname 2 ile 20 arasında olmalı")
    private String     surname;
    @Max(400)
    @Min(20)
    private int        weight;
    @Max(300)
    @Min(50)
    private int        height;

    private EGender    gender;
    private String     note;

    private Address    address;

    private Set<Phone> phones;

    public EGender getGender() {
        return this.gender;
    }


    public void setGender(final EGender genderParam) {
        this.gender = genderParam;
    }


    public String getNote() {
        return this.note;
    }


    public void setNote(final String noteParam) {
        this.note = noteParam;
    }


    public Address getAddress() {
        return this.address;
    }


    public void setAddress(final Address addressParam) {
        this.address = addressParam;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weightParam) {
        this.weight = weightParam;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int heightParam) {
        this.height = heightParam;
    }


    public Set<Phone> getPhones() {
        return this.phones;
    }


    public void setPhones(final Set<Phone> phonesParam) {
        this.phones = phonesParam;
    }


}
