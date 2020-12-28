package com.company;

import java.io.File;
import java.util.*;

import Executor.BinaryExecutor;
import Executor.Executable;
import Executor.JsonExecutor;
import com.company.ConvertStringToFormat.PersonConvertBinary;
import com.company.ConvertStringToFormat.PersonConverterJson;
import com.company.utils.FileHelper;

import java.io.IOException;

public class Main extends Object {
    private Executable executor;

    public static void main(String[] args) {
        Person person1 = new Person(11,"3ddd","a22a",12,"f2");
        Person person2 = new Person(10,"ff","FF",133,"Kiev");
        Person person3 = new Person(110,"f11f","FF22",03,"XZ");
        BinaryExecutor binaryExecutor = new BinaryExecutor();
//        PersonConverterJson personConverterJson = new PersonConverterJson();
    JsonExecutor jsonExecutor = new JsonExecutor();
    List<Person> personList = new ArrayList<>();
    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    jsonExecutor.update(person2);

   //binaryExecutor.write(personList);
     //   binaryExecutor.read();


//    jsonExecutor.write(personList);

//        try {
//            System.out.println(jsonExecutor.read());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }






    public static void start() {
        ScanerFileName scanerFileName = new ScanerFileName();
        //  scanerFileName.scannerFileNameAndCreateFile();
        scanerFileName.choiseWay(scanerFileName.getFileExtension(scanerFileName.inputFileName));
//        } catch (IOException e) {
//            System.out.println("Что то не так");
//


        ;


    }
}

