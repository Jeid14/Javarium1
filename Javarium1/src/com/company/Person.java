package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;
    String city;
    public Integer getId(){
        return id;
    }
    public String getFmale(){
        return firstName;
    }
    public String getName(){
        return lastName;
    }
    public Integer getAge(){
        return age;
    }
    public String getCity(){
        return city;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setFmale(String fmale){
        this.firstName = fmale;

    }
    public void setName(String name){
        this.lastName = name;

    }
    public void setCity(String city){
        this.city = city;
    }



    }

