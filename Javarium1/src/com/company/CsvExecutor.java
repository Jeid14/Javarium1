package com.company;

import au.com.bytecode.opencsv.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvExecutor implements Executable{
    String fileName = "C:\\Users\\l\\Desktop\\2.csv";
    @Override
    public void write(Person person) {

    }

    @Override
    public List<Person> read() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("data.csv"), ',', '"', 1);
        List<String[]> personArrayList = csvReader.readAll();
        


            return personArrayList;
        }


    @Override
    public boolean update(Person person) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
