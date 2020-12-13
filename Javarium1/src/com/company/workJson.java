package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class workJson {
    Person person = new Person();
    ScanerFileName scanerFileName = new ScanerFileName;

//    public  void addINJson(){
//        Person person = new Person();
//        person.id = 1;
//        person.lastName = "Anna";
//        person.firstName = "Chulkova";
//        person.age = 22;
//        person.city = "Kharkiv";
//        GsonBuilder builder = new GsonBuilder();
//        Gson gson = builder.create();
//        gson.toJson(person);
//
//    }
    public void JsontoObjeckt(){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        person = gson.fromJson(scanerFileName.inputFileName,Person.class);
    }
    public void ObjecktToJason(){
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        gson.toJson(person);

    }
}
