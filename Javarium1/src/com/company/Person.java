package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// POJO classes
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String city;



    public Person(int id, String firstName, String lastName, int age, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
public List<Person> createListPerson(Person person){
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(person);
        return listPerson;
}

    public String toString() {

        return firstName;
    }
}
