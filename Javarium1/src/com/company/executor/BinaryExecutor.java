package com.company.executor;

import com.company.model.Person;

import java.io.*;
import java.util.List;

public class BinaryExecutor implements Executable  {

    @Override
    public void write(String fileName, List<Person> personList) throws IOException {

    }

    @Override
    public List<Person> read(String fileName) throws IOException {
        return null;
    }

    @Override
    public boolean update(String fileName, List<Person> person) {
        return false;
    }

    @Override
    public boolean delete(String fileName, int id) {
        return false;
    }
}
