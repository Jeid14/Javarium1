package com.company;

import java.io.IOException;
import java.util.*;

import com.company.converterstr.PersonConvertToCSV;
import com.company.converterstr.PersonConvertYaml;
import com.company.executor.BinaryExecutor;
import com.company.executor.Executable;
import com.company.converterstr.PersonConvertToXML;
import com.company.executor.ExecutorFactory;
import com.company.executor.StringFormatExecutor;
import com.company.model.Person;
import com.company.utils.FileHelper;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) throws IOException {


      ScanerFileName scanerFileName = new ScanerFileName();
      FileHelper fileHelper = new FileHelper();

        PersonConvertToCSV personConvertToCSV = new PersonConvertToCSV();
        PersonConvertToXML personConvertToXML = new PersonConvertToXML();
        PersonConvertYaml personConvertYaml = new PersonConvertYaml();

        Person person1 = new Person(11, "Ann", "Kan", 12, "Kharkiv");
        Person person2 = new Person(10, "MAKS", "Fu", 133, "Kiev");
        Person person3 = new Person(110, "Jeid", "Osi", 3, "XZ");

        List<Person> personList = new ArrayList<>();


        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

      fileHelper


    }
    



}

