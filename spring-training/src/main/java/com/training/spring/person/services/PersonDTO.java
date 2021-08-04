package com.training.spring.person.services;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "person")
public class PersonDTO {

    //    @EmbeddedId
    //    private PersonCompositeId myId;

    @Id
    @GeneratedValue
    private Long          personId;

    @Column(length = 20)
    private String        name;
    @Size(min = 2, max = 30)
    private String        surname;
    private int           weight;
    private int           height;

    @Embedded
    private PersonDetails personDetails;

    @OneToOne(fetch = FetchType.EAGER,
              cascade = {
                          CascadeType.ALL
              },
              mappedBy = "person")
    private Address       address;

    @OneToMany(fetch = FetchType.EAGER,
               cascade = {
                           CascadeType.ALL
               },
               mappedBy = "person")
    private Set<Phone>    phones;

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

    public PersonDetails getPersonDetails() {
        return this.personDetails;
    }

    public void setPersonDetails(final PersonDetails personDetailsParam) {
        this.personDetails = personDetailsParam;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(final Address addressParam) {
        this.address = addressParam;
    }

    public Set<Phone> getPhones() {
        return this.phones;
    }

    public void setPhones(final Set<Phone> phonesParam) {
        this.phones = phonesParam;
    }


}
