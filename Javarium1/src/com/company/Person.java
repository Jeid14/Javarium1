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

    public String toString() {
        return firstName + "  " + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }
}
