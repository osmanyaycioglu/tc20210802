package com.training.spring.rest;


public class GreetingInput {

    private String  name;
    private String  surname;
    private Integer age;

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


    public Integer getAge() {
        return this.age;
    }


    public void setAge(final Integer ageParam) {
        this.age = ageParam;
    }


}
