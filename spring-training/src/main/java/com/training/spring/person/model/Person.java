package com.training.spring.person.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    @NotEmpty
    @Size(min = 2, max = 20, message = "Name 2 ile 20 arasında olmalı")
    private String name;
    @NotEmpty
    @Size(min = 2, max = 30, message = "Surname 2 ile 20 arasında olmalı")
    private String surname;
    @Max(400)
    @Min(20)
    private int    weight;
    @Max(300)
    @Min(50)
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
