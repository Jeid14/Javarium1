package com.company.executor;

import com.company.model.Person;

import java.io.IOException;
import java.util.List;


public interface Executable {
    void write(String fileName, List<Person> personList) throws IOException;
    List<Person> read(String fileName) throws IOException;
    boolean update(String fileName, List<Person> person);
    boolean delete(String fileName, int id);
}
