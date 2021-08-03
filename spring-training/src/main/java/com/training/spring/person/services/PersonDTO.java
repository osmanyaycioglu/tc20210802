package com.training.spring.person.services;


public class PersonDTO {

    private String name;
    private String surname;
    private int    weight;
    private int    height;

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


}
