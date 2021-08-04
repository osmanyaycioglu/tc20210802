package com.training.spring.person.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long      addId;

    private String    city;
    private String    street;

    @JsonIgnore
    @XmlTransient
    @OneToOne
    @JoinColumn(name = "perId", nullable = false)
    private PersonDTO person;

    public String getCity() {
        return this.city;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(final String streetParam) {
        this.street = streetParam;
    }

    public PersonDTO getPerson() {
        return this.person;
    }

    public void setPerson(final PersonDTO personParam) {
        this.person = personParam;
    }


}
